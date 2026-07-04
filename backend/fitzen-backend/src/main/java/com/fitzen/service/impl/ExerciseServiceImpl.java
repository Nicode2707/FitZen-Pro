package com.fitzen.service.impl;

import com.fitzen.dto.ExerciseRequest;
import com.fitzen.dto.ExerciseResponse;
import com.fitzen.entity.Exercise;
import com.fitzen.entity.User;
import com.fitzen.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public ExerciseResponse createExercise(ExerciseRequest request) {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        User loggedInUser = (User) authentication.getPrincipal();

        Exercise exercise = new Exercise();

        exercise.setExerciseName(request.getExerciseName());
        exercise.setBodyPart(request.getBodyPart());
        exercise.setSets(request.getSets());
        exercise.setReps(request.getReps());
        exercise.setCaloriesBurned(request.getCaloriesBurned());
        exercise.setDescription(request.getDescription());
        exercise.setUser(loggedInUser);

        Exercise savedExercise = exerciseRepository.save(exercise);

        return new ExerciseResponse(
                savedExercise.getId(),
                savedExercise.getExerciseName(),
                savedExercise.getBodyPart(),
                savedExercise.getSets(),
                savedExercise.getReps(),
                savedExercise.getCaloriesBurned(),
                savedExercise.getDescription()
        );
    }
}