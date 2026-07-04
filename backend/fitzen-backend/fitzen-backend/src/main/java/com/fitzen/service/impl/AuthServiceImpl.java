package com.fitzen.service.impl;

import com.fitzen.dto.AuthResponse;
import com.fitzen.dto.LoginRequest;
import com.fitzen.dto.RegisterRequest;
import com.fitzen.entity.Role;
import com.fitzen.entity.User;
import com.fitzen.enums.RoleName;
import com.fitzen.repository.RoleRepository;
import com.fitzen.repository.UserRepository;
import com.fitzen.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public AuthResponse register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        Role userRole = roleRepository.findByRoleName(RoleName.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Default role not found"));

        User user = new User();

        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setPhone(request.getPhone());
        user.setAge(request.getAge());
        user.setGender(request.getGender());
        user.setHeight(request.getHeight());
        user.setWeight(request.getWeight());
        user.setDateOfBirth(request.getDateOfBirth());

        user.getRoles().add(userRole);

        userRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail());

        return new AuthResponse(
                token,
                "User Registered Successfully",
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.getAge(),
                user.getGender().name(),
                user.getHeight(),
                user.getWeight()
        );
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        String token = jwtUtil.generateToken(user.getEmail());

        return new AuthResponse(
                token,
                "Login Successful",
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.getAge(),
                user.getGender().name(),
                user.getHeight(),
                user.getWeight()
        );
    }
}