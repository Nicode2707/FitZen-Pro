package com.fitzen.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class SleepResponse {

    private Long id;
    private Double sleepHours;
    private String sleepQuality;
    private LocalTime bedTime;
    private LocalTime wakeTime;
    private LocalDate sleepDate;

    public SleepResponse() {
    }

    public SleepResponse(Long id,
                         Double sleepHours,
                         String sleepQuality,
                         LocalTime bedTime,
                         LocalTime wakeTime,
                         LocalDate sleepDate) {

        this.id = id;
        this.sleepHours = sleepHours;
        this.sleepQuality = sleepQuality;
        this.bedTime = bedTime;
        this.wakeTime = wakeTime;
        this.sleepDate = sleepDate;
    }

    public Long getId() {
        return id;
    }

    public Double getSleepHours() {
        return sleepHours;
    }

    public String getSleepQuality() {
        return sleepQuality;
    }

    public LocalTime getBedTime() {
        return bedTime;
    }

    public LocalTime getWakeTime() {
        return wakeTime;
    }

    public LocalDate getSleepDate() {
        return sleepDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSleepHours(Double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public void setSleepQuality(String sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public void setBedTime(LocalTime bedTime) {
        this.bedTime = bedTime;
    }

    public void setWakeTime(LocalTime wakeTime) {
        this.wakeTime = wakeTime;
    }

    public void setSleepDate(LocalDate sleepDate) {
        this.sleepDate = sleepDate;
    }
}