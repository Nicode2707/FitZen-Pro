package com.fitzen.service.impl;

import com.fitzen.dto.MealRequest;
import com.fitzen.dto.MealResponse;

public interface MealService {

    MealResponse createMeal(MealRequest request);

}
