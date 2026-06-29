package com.taha.userauth.controller;

import com.taha.userauth.dto.GetUserResponse;
import com.taha.userauth.entity.User;
import com.taha.userauth.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User", description = "Protected User APIs")
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @Operation(
            summary = "Get Current User",
            description = "Returns the profile information of the authenticated user."
    )
    @GetMapping("/me")
    public ResponseEntity<GetUserResponse> getCurrentUser(){
        User user = userService.currentUser();
        GetUserResponse getUserResponse = new GetUserResponse();
        getUserResponse.setId(user.getId());
        getUserResponse.setEmail(user.getEmail());
        getUserResponse.setName(user.getName());
        getUserResponse.setRole(user.getRole().toString());
        return ResponseEntity.status(HttpStatus.OK).body(getUserResponse);
    }
}
