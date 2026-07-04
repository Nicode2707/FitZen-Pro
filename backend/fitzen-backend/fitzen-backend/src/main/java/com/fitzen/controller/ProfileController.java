package com.fitzen.controller;

import com.fitzen.dto.ProfileRequest;
import com.fitzen.dto.ProfileResponse;
import com.fitzen.service.impl.ProfileService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public ProfileResponse getProfile() {
        return profileService.getProfile();
    }

    @PutMapping
    public ProfileResponse updateProfile(
            @Valid @RequestBody ProfileRequest request) {

        return profileService.updateProfile(request);
    }
}