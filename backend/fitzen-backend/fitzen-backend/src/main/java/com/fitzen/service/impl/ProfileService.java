package com.fitzen.service.impl;

import com.fitzen.dto.ProfileRequest;
import com.fitzen.dto.ProfileResponse;

public interface ProfileService {

    ProfileResponse getProfile();

    ProfileResponse updateProfile(ProfileRequest request);
}
