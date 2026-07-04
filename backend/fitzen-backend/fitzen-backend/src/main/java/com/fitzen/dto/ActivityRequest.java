package com.fitzen.dto;

import jakarta.validation.constraints.NotNull;

public class ActivityRequest {

    @NotNull
    private Integer steps;

    @NotNull
    private Double distance;

    @NotNull
    private Integer caloriesBurned;

    @NotNull
    private Integer activeMinutes;

    public ActivityRequest() {
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public Integer getActiveMinutes() {
        return activeMinutes;
    }

    public void setActiveMinutes(Integer activeMinutes) {
        this.activeMinutes = activeMinutes;
    }
}