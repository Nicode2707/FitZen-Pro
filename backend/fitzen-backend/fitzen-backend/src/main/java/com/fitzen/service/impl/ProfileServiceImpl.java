package com.fitzen.service.impl;

import com.fitzen.dto.ProfileRequest;
import com.fitzen.dto.ProfileResponse;
import com.fitzen.entity.User;
import com.fitzen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ProfileResponse getProfile() {

        User user = userRepository.findById(1L).orElseThrow();

        return new ProfileResponse(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getAge(),
                user.getHeight(),
                user.getWeight(),
                user.getGender()
        );
    }

    @Override
    public ProfileResponse updateProfile(ProfileRequest request) {

        User user = userRepository.findById(1L).orElseThrow();

        user.setFullName(request.getFullName());
        user.setAge(request.getAge());
        user.setHeight(request.getHeight());
        user.setWeight(request.getWeight());
        user.setGender(request.getGender());

        User saved = userRepository.save(user);

        return new ProfileResponse(
                saved.getId(),
                saved.getFullName(),
                saved.getEmail(),
                saved.getAge(),
                saved.getHeight(),
                saved.getWeight(),
                saved.getGender()
        );
    }
}
