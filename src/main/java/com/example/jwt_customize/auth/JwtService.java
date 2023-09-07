package com.example.jwt_customize.auth;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public interface JwtService {
    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);
    Date extractExpiration(String token);
    Boolean isTokenExpired(String token);
    public String generateRefreshToken(UserDetails userDetails);
}
