package com.fitzen.service.impl;

import com.fitzen.dto.ExerciseRequest;
import com.fitzen.dto.ExerciseResponse;

public interface ExerciseService {

    ExerciseResponse createExercise(ExerciseRequest request);

}