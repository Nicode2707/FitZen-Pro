package com.fitzen.dto;

import java.time.LocalDate;

public class ProgressResponse {

    private Long id;
    private Double weight;
    private Double bmi;
    private LocalDate recordDate;

    public ProgressResponse() {
    }

    public ProgressResponse(Long id,
                            Double weight,
                            Double bmi,
                            LocalDate recordDate) {

        this.id = id;
        this.weight = weight;
        this.bmi = bmi;
        this.recordDate = recordDate;
    }

    public Long getId() {
        return id;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getBmi() {
        return bmi;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }
}