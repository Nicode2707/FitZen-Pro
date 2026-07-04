package com.fitzen.dto;

import jakarta.validation.constraints.NotNull;

public class ProgressRequest {

    @NotNull
    private Double weight;

    @NotNull
    private Double bmi;

    public ProgressRequest() {
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
}