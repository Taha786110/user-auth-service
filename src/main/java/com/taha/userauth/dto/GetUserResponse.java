package com.taha.userauth.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;

@Getter
@Setter
public class GetUserResponse {
    private String name;
    private String role;
    private long id;
    private String email;
}
