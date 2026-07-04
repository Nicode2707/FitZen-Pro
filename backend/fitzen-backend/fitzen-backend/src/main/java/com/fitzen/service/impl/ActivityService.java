package com.fitzen.service.impl;

import com.fitzen.dto.ActivityRequest;
import com.fitzen.dto.ActivityResponse;

public interface ActivityService {

    ActivityResponse createActivity(ActivityRequest request);

}