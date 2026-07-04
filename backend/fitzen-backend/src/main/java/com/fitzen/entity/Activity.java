package com.fitzen.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "activities")
public class Activity extends BaseEntity {

    @Column(nullable = false)
    private Integer steps;

    @Column(nullable = false)
    private Double distance;

    @Column(nullable = false)
    private Integer caloriesBurned;

    @Column(nullable = false)
    private Integer activeMinutes;

    @Column(nullable = false)
    private LocalDate activityDate;

    public Activity() {
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

    public LocalDate getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(LocalDate activityDate) {
        this.activityDate = activityDate;
    }
}