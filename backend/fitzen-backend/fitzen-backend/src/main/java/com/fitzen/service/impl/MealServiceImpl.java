package com.fitzen.service.impl;

import com.fitzen.dto.MealRequest;
import com.fitzen.dto.MealResponse;
import com.fitzen.entity.Meal;
import com.fitzen.entity.User;
import com.fitzen.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class MealServiceImpl implements MealService {

    @Autowired
    private MealRepository mealRepository;

    @Override
    public MealResponse createMeal(MealRequest request) {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        User loggedInUser = (User) authentication.getPrincipal();

        Meal meal = new Meal();

        meal.setMealName(request.getMealName());
        meal.setMealType(request.getMealType());
        meal.setCalories(request.getCalories());
        meal.setProtein(request.getProtein());
        meal.setCarbs(request.getCarbs());
        meal.setFats(request.getFats());
        meal.setDescription(request.getDescription());
        meal.setUser(loggedInUser);

        Meal savedMeal = mealRepository.save(meal);

        return new MealResponse(
                savedMeal.getId(),
                savedMeal.getMealName(),
                savedMeal.getMealType(),
                savedMeal.getCalories(),
                savedMeal.getProtein(),
                savedMeal.getCarbs(),
                savedMeal.getFats(),
                savedMeal.getDescription()
        );
    }
}
