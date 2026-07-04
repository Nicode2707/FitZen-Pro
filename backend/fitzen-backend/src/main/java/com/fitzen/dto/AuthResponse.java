package com.fitzen.dto;

public class AuthResponse {

    private String token;
    private String message;

    private String fullName;
    private String email;
    private String phone;
    private Integer age;
    private String gender;
    private Double height;
    private Double weight;

    public AuthResponse() {
    }

    public AuthResponse(
            String token,
            String message,
            String fullName,
            String email,
            String phone,
            Integer age,
            String gender,
            Double height,
            Double weight
    ) {
        this.token = token;
        this.message = message;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}