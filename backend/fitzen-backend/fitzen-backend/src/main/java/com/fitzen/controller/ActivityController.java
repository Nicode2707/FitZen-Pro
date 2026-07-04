package com.fitzen.controller;

import com.fitzen.dto.ActivityRequest;
import com.fitzen.dto.ActivityResponse;
import com.fitzen.service.impl.ActivityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public ActivityResponse createActivity(
            @Valid @RequestBody ActivityRequest request) {

        return activityService.createActivity(request);
    }
}