package com.fitzen.service.impl;

import com.fitzen.dto.WorkoutRequest;
import com.fitzen.dto.WorkoutResponse;
import com.fitzen.entity.User;
import com.fitzen.entity.Workout;
import com.fitzen.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public WorkoutResponse createWorkout(WorkoutRequest request) {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        User loggedInUser = (User) authentication.getPrincipal();

        Workout workout = new Workout();

        workout.setWorkoutName(request.getWorkoutName());
        workout.setCategory(request.getCategory());
        workout.setDuration(request.getDuration());
        workout.setCaloriesBurned(request.getCaloriesBurned());
        workout.setDescription(request.getDescription());
        workout.setUser(loggedInUser);

        Workout savedWorkout = workoutRepository.save(workout);

        return new WorkoutResponse(
                savedWorkout.getId(),
                savedWorkout.getWorkoutName(),
                savedWorkout.getCategory(),
                savedWorkout.getDuration(),
                savedWorkout.getCaloriesBurned(),
                savedWorkout.getDescription()
        );
    }
}