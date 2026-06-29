package com.taha.userauth.service;

import com.taha.userauth.config.SecurityBeansConfig;
import com.taha.userauth.dto.LoginRequest;
import com.taha.userauth.dto.RegisterRequest;
import com.taha.userauth.entity.User;
import com.taha.userauth.exception.EmailAlreadyExistsException;
import com.taha.userauth.exception.InvalidCredentials;
import com.taha.userauth.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthService(UserRepository userRepository, SecurityBeansConfig securityBeansConfig, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }



    public User register(RegisterRequest request){
        if(userRepository.existsByEmail(request.getEmail())){
            throw new EmailAlreadyExistsException("Email already exists");
        }
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(User.Role.USER);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public String login(LoginRequest request){
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new InvalidCredentials("Invalid Email or Password"));
        if(!passwordEncoder.matches(request.getPassword(),user.getPassword())){
            throw new InvalidCredentials("Invalid Email or Password");
        }
        return jwtService.generateToken(user);
    }
}
