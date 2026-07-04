package com.fitzen.dto;

public class StatisticsResponse {

    private Long totalGoals;
    private Long totalWorkouts;
    private Long totalExercises;
    private Long totalMeals;
    private Long totalWaterRecords;
    private Long totalSleepRecords;
    private Long totalProgressRecords;
    private Long totalActivities;

    public StatisticsResponse() {
    }

    public StatisticsResponse(Long totalGoals,
                              Long totalWorkouts,
                              Long totalExercises,
                              Long totalMeals,
                              Long totalWaterRecords,
                              Long totalSleepRecords,
                              Long totalProgressRecords,
                              Long totalActivities) {

        this.totalGoals = totalGoals;
        this.totalWorkouts = totalWorkouts;
        this.totalExercises = totalExercises;
        this.totalMeals = totalMeals;
        this.totalWaterRecords = totalWaterRecords;
        this.totalSleepRecords = totalSleepRecords;
        this.totalProgressRecords = totalProgressRecords;
        this.totalActivities = totalActivities;
    }

    public Long getTotalGoals() {
        return totalGoals;
    }

    public Long getTotalWorkouts() {
        return totalWorkouts;
    }

    public Long getTotalExercises() {
        return totalExercises;
    }

    public Long getTotalMeals() {
        return totalMeals;
    }

    public Long getTotalWaterRecords() {
        return totalWaterRecords;
    }

    public Long getTotalSleepRecords() {
        return totalSleepRecords;
    }

    public Long getTotalProgressRecords() {
        return totalProgressRecords;
    }

    public Long getTotalActivities() {
        return totalActivities;
    }

    public void setTotalGoals(Long totalGoals) {
        this.totalGoals = totalGoals;
    }

    public void setTotalWorkouts(Long totalWorkouts) {
        this.totalWorkouts = totalWorkouts;
    }

    public void setTotalExercises(Long totalExercises) {
        this.totalExercises = totalExercises;
    }

    public void setTotalMeals(Long totalMeals) {
        this.totalMeals = totalMeals;
    }

    public void setTotalWaterRecords(Long totalWaterRecords) {
        this.totalWaterRecords = totalWaterRecords;
    }

    public void setTotalSleepRecords(Long totalSleepRecords) {
        this.totalSleepRecords = totalSleepRecords;
    }

    public void setTotalProgressRecords(Long totalProgressRecords) {
        this.totalProgressRecords = totalProgressRecords;
    }

    public void setTotalActivities(Long totalActivities) {
        this.totalActivities = totalActivities;
    }
}