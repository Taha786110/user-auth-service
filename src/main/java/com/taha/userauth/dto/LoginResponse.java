package com.taha.userauth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String message;
    private String token;
    private long expiresIn;
}
