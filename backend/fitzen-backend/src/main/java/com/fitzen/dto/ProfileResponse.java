package com.fitzen.dto;

import com.fitzen.enums.Gender;

public class ProfileResponse {

    private Long id;
    private String fullName;
    private String email;
    private Integer age;
    private Double height;
    private Double weight;
    private Gender gender;

    public ProfileResponse() {
    }

    public ProfileResponse(Long id,
                           String fullName,
                           String email,
                           Integer age,
                           Double height,
                           Double weight,
                           Gender gender) {

        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}