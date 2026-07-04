package com.fitzen.service.impl;

import com.fitzen.dto.HealthRequest;
import com.fitzen.dto.HealthResponse;

public interface HealthService {

    HealthResponse calculateHealth(HealthRequest request);

}