package com.fitzen.controller;

import com.fitzen.dto.MealRequest;
import com.fitzen.dto.MealResponse;
import com.fitzen.service.impl.MealService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping
    public MealResponse createMeal(
            @Valid @RequestBody MealRequest request) {

        return mealService.createMeal(request);
    }
}
