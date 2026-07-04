package com.fitzen.service.impl;

import com.fitzen.dto.WorkoutRequest;
import com.fitzen.dto.WorkoutResponse;

public interface WorkoutService {

    WorkoutResponse createWorkout(WorkoutRequest request);

}