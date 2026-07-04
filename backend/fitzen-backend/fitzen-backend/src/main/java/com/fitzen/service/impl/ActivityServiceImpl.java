package com.fitzen.service.impl;

import com.fitzen.dto.ActivityRequest;
import com.fitzen.dto.ActivityResponse;
import com.fitzen.entity.Activity;
import com.fitzen.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public ActivityResponse createActivity(ActivityRequest request) {

        Activity activity = new Activity();

        activity.setSteps(request.getSteps());
        activity.setDistance(request.getDistance());
        activity.setCaloriesBurned(request.getCaloriesBurned());
        activity.setActiveMinutes(request.getActiveMinutes());
        activity.setActivityDate(LocalDate.now());

        Activity saved = activityRepository.save(activity);

        return new ActivityResponse(
                saved.getId(),
                saved.getSteps(),
                saved.getDistance(),
                saved.getCaloriesBurned(),
                saved.getActiveMinutes(),
                saved.getActivityDate()
        );
    }
}
