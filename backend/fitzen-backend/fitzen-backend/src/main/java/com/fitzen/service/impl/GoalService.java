package com.fitzen.service.impl;

import com.fitzen.dto.GoalRequest;
import com.fitzen.dto.GoalResponse;

public interface GoalService {

    GoalResponse createGoal(GoalRequest request);

}