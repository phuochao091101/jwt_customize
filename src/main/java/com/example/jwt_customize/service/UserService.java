package com.example.jwt_customize.service;

import com.example.jwt_customize.request.RegisterRequest;
import com.example.jwt_customize.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);
    List<User> findAll();
    void save(RegisterRequest request);
}
