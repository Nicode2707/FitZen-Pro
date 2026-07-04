package com.fitzen.controller;

import com.fitzen.dto.WorkoutRequest;
import com.fitzen.dto.WorkoutResponse;
import com.fitzen.service.impl.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public WorkoutResponse createWorkout(
            @Valid @RequestBody WorkoutRequest request) {

        return workoutService.createWorkout(request);
    }
}