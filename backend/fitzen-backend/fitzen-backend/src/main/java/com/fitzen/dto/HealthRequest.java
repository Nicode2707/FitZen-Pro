package com.fitzen.dto;

import com.fitzen.enums.Gender;
import jakarta.validation.constraints.NotNull;

public class HealthRequest {

    @NotNull
    private Double weight;

    @NotNull
    private Double height;

    @NotNull
    private Integer age;

    @NotNull
    private Gender gender;

    @NotNull
    private Double activityFactor;

    public HealthRequest() {
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getActivityFactor() {
        return activityFactor;
    }

    public void setActivityFactor(Double activityFactor) {
        this.activityFactor = activityFactor;
    }
}
