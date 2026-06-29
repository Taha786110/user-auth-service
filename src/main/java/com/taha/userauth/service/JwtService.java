package com.taha.userauth.service;


import com.taha.userauth.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;

@Service
public class JwtService {
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private long expiration;
    public String generateToken(User user){
        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
        long currentTime = Instant.now().toEpochMilli();
        long new_expiry = expiration + currentTime;
        Date date = new Date(new_expiry);
        String id = user.getId().toString();
        String role = user.getRole().toString();
        String token = Jwts.builder()
                .subject(id)
                .claim("role",role)

                .signWith(key)
                .expiration(date)
                .compact();

        return token;
    }

    public long extractUserId(String token){
        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
            Jws<Claims> claims = Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token);
            String subject = claims.getPayload().getSubject();
            return Long.parseLong(subject);

    }
}
