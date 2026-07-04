package com.fitzen.dto;

public class GoalResponse {

    private Long id;
    private String goalName;
    private String description;
    private Double targetWeight;
    private Integer targetCalories;

    public GoalResponse() {
    }

    public GoalResponse(Long id,
                        String goalName,
                        String description,
                        Double targetWeight,
                        Integer targetCalories) {

        this.id = id;
        this.goalName = goalName;
        this.description = description;
        this.targetWeight = targetWeight;
        this.targetCalories = targetCalories;
    }

    public Long getId() {
        return id;
    }

    public String getGoalName() {
        return goalName;
    }

    public String getDescription() {
        return description;
    }

    public Double getTargetWeight() {
        return targetWeight;
    }

    public Integer getTargetCalories() {
        return targetCalories;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetWeight(Double targetWeight) {
        this.targetWeight = targetWeight;
    }

    public void setTargetCalories(Integer targetCalories) {
        this.targetCalories = targetCalories;
    }
}