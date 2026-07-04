package com.fitzen.service.impl;

import com.fitzen.dto.HealthRequest;
import com.fitzen.dto.HealthResponse;
import com.fitzen.enums.Gender;
import org.springframework.stereotype.Service;

@Service
public class HealthServiceImpl implements HealthService {

    @Override
    public HealthResponse calculateHealth(HealthRequest request) {

        double heightInMeter = request.getHeight() / 100.0;

        // BMI
        double bmi = request.getWeight() /
                (heightInMeter * heightInMeter);

        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // BMR
        double bmr;

        if (request.getGender() == Gender.MALE) {

            bmr =
                    10 * request.getWeight()
                            + 6.25 * request.getHeight()
                            - 5 * request.getAge()
                            + 5;

        } else {

            bmr =
                    10 * request.getWeight()
                            + 6.25 * request.getHeight()
                            - 5 * request.getAge()
                            - 161;

        }

        // TDEE
        double tdee =
                bmr * request.getActivityFactor();

        int recommendedCalories =
                (int) Math.round(tdee);

        return new HealthResponse(

                Math.round(bmi * 100.0) / 100.0,
                category,
                Math.round(bmr * 100.0) / 100.0,
                Math.round(tdee * 100.0) / 100.0,
                recommendedCalories

        );

    }

}