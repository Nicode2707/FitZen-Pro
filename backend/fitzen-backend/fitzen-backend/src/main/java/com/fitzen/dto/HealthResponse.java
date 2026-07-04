package com.fitzen.dto;

public class HealthResponse {

    private Double bmi;
    private String bmiCategory;
    private Double bmr;
    private Double tdee;
    private Integer recommendedCalories;

    public HealthResponse() {
    }

    public HealthResponse(Double bmi,
                          String bmiCategory,
                          Double bmr,
                          Double tdee,
                          Integer recommendedCalories) {

        this.bmi = bmi;
        this.bmiCategory = bmiCategory;
        this.bmr = bmr;
        this.tdee = tdee;
        this.recommendedCalories = recommendedCalories;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }

    public Double getBmr() {
        return bmr;
    }

    public void setBmr(Double bmr) {
        this.bmr = bmr;
    }

    public Double getTdee() {
        return tdee;
    }

    public void setTdee(Double tdee) {
        this.tdee = tdee;
    }

    public Integer getRecommendedCalories() {
        return recommendedCalories;
    }

    public void setRecommendedCalories(Integer recommendedCalories) {
        this.recommendedCalories = recommendedCalories;
    }
}