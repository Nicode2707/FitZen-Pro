package com.fitzen.service.impl;

import com.fitzen.dto.AuthResponse;
import com.fitzen.dto.LoginRequest;
import com.fitzen.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}