package com.fitzen.dto;

public class WorkoutResponse {

    private Long id;
    private String workoutName;
    private String category;
    private Integer duration;
    private Integer caloriesBurned;
    private String description;

    public WorkoutResponse() {
    }

    public WorkoutResponse(Long id,
                           String workoutName,
                           String category,
                           Integer duration,
                           Integer caloriesBurned,
                           String description) {

        this.id = id;
        this.workoutName = workoutName;
        this.category = category;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public String getCategory() {
        return category;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
