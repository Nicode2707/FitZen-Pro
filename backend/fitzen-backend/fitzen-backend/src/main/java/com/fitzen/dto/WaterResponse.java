package com.fitzen.dto;

public class WaterResponse {

    private Long id;
    private Integer amount;

    public WaterResponse() {
    }

    public WaterResponse(Long id, Integer amount) {
        this.id = id;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
