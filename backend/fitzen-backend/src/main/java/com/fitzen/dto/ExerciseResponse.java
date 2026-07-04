package com.fitzen.dto;

public class ExerciseResponse {

    private Long id;
    private String exerciseName;
    private String bodyPart;
    private Integer sets;
    private Integer reps;
    private Integer caloriesBurned;
    private String description;

    public ExerciseResponse() {
    }

    public ExerciseResponse(Long id,
                            String exerciseName,
                            String bodyPart,
                            Integer sets,
                            Integer reps,
                            Integer caloriesBurned,
                            String description) {

        this.id = id;
        this.exerciseName = exerciseName;
        this.bodyPart = bodyPart;
        this.sets = sets;
        this.reps = reps;
        this.caloriesBurned = caloriesBurned;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public Integer getSets() {
        return sets;
    }

    public Integer getReps() {
        return reps;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public String getDescription() {
        return description;
    }
}