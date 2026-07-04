package com.fitzen.dto;

import jakarta.validation.constraints.NotNull;

public class WaterRequest {

    @NotNull
    private Integer amount;

    public WaterRequest() {
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}