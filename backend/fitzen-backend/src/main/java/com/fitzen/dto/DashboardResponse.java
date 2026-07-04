package com.fitzen.dto;

public class DashboardResponse {

    private Long totalGoals;
    private Long totalWorkouts;
    private Long totalExercises;
    private Long totalMeals;
    private Integer todayCalories;

    public DashboardResponse() {
    }

    public DashboardResponse(Long totalGoals,
                             Long totalWorkouts,
                             Long totalExercises,
                             Long totalMeals,
                             Integer todayCalories) {
        this.totalGoals = totalGoals;
        this.totalWorkouts = totalWorkouts;
        this.totalExercises = totalExercises;
        this.totalMeals = totalMeals;
        this.todayCalories = todayCalories;
    }

    public Long getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(Long totalGoals) {
        this.totalGoals = totalGoals;
    }

    public Long getTotalWorkouts() {
        return totalWorkouts;
    }

    public void setTotalWorkouts(Long totalWorkouts) {
        this.totalWorkouts = totalWorkouts;
    }

    public Long getTotalExercises() {
        return totalExercises;
    }

    public void setTotalExercises(Long totalExercises) {
        this.totalExercises = totalExercises;
    }

    public Long getTotalMeals() {
        return totalMeals;
    }

    public void setTotalMeals(Long totalMeals) {
        this.totalMeals = totalMeals;
    }

    public Integer getTodayCalories() {
        return todayCalories;
    }

    public void setTodayCalories(Integer todayCalories) {
        this.todayCalories = todayCalories;
    }
}
