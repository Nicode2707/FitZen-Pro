package com.fitzen.dto;

public class MealResponse {

    private Long id;
    private String mealName;
    private String mealType;
    private Integer calories;
    private Double protein;
    private Double carbs;
    private Double fats;
    private String description;

    public MealResponse() {
    }

    public MealResponse(Long id,
                        String mealName,
                        String mealType,
                        Integer calories,
                        Double protein,
                        Double carbs,
                        Double fats,
                        String description) {

        this.id = id;
        this.mealName = mealName;
        this.mealType = mealType;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
        this.description = description;
    }

    public Long getId() { return id; }

    public String getMealName() { return mealName; }

    public String getMealType() { return mealType; }

    public Integer getCalories() { return calories; }

    public Double getProtein() { return protein; }

    public Double getCarbs() { return carbs; }

    public Double getFats() { return fats; }

    public String getDescription() { return description; }
}