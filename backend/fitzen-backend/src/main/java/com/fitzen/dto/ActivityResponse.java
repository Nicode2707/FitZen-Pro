package com.fitzen.dto;

import java.time.LocalDate;

public class ActivityResponse {

    private Long id;
    private Integer steps;
    private Double distance;
    private Integer caloriesBurned;
    private Integer activeMinutes;
    private LocalDate activityDate;

    public ActivityResponse() {
    }

    public ActivityResponse(Long id, Integer steps, Double distance,
                            Integer caloriesBurned,
                            Integer activeMinutes,
                            LocalDate activityDate) {

        this.id = id;
        this.steps = steps;
        this.distance = distance;
        this.caloriesBurned = caloriesBurned;
        this.activeMinutes = activeMinutes;
        this.activityDate = activityDate;
    }

    public Long getId() {
        return id;
    }

    public Integer getSteps() {
        return steps;
    }

    public Double getDistance() {
        return distance;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public Integer getActiveMinutes() {
        return activeMinutes;
    }

    public LocalDate getActivityDate() {
        return activityDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void setActiveMinutes(Integer activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    public void setActivityDate(LocalDate activityDate) {
        this.activityDate = activityDate;
    }
}
