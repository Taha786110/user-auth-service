package com.taha.userauth.controller;

import com.taha.userauth.dto.LoginRequest;
import com.taha.userauth.dto.LoginResponse;
import com.taha.userauth.dto.RegisterRequest;
import com.taha.userauth.dto.RegisterResponse;
import com.taha.userauth.entity.User;
import com.taha.userauth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody @Valid RegisterRequest request){
        User user = authService.register(request);
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setId(user.getId());
        registerResponse.setMessage("User Created Successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body(registerResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest request){
    String token = authService.login(request);
    LoginResponse loginResponse = new LoginResponse();
    loginResponse.setMessage("Login Successful");
    loginResponse.setToken(token);
    loginResponse.setExpiresIn(3600000);
    return ResponseEntity.status(HttpStatus.OK).body(loginResponse);
    }


}
