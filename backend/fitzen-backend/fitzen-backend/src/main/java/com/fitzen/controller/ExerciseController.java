package com.fitzen.controller;

import com.fitzen.dto.ExerciseRequest;
import com.fitzen.dto.ExerciseResponse;
import com.fitzen.service.impl.ExerciseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public ExerciseResponse createExercise(
            @Valid @RequestBody ExerciseRequest request) {

        return exerciseService.createExercise(request);
    }
}