package com.taha.userauth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    public enum Role {
        USER,
        ADMIN
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(nullable = false)
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
