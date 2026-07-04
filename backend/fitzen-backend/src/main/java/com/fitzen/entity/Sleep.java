package com.fitzen.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sleep")
public class Sleep extends BaseEntity {

    @Column(nullable = false)
    private Double sleepHours;

    @Column(nullable = false)
    private String sleepQuality;

    @Column(nullable = false)
    private LocalTime bedTime;

    @Column(nullable = false)
    private LocalTime wakeTime;

    @Column(nullable = false)
    private LocalDate sleepDate;

    public Sleep() {
    }

    public Double getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(Double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public String getSleepQuality() {
        return sleepQuality;
    }

    public void setSleepQuality(String sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public LocalTime getBedTime() {
        return bedTime;
    }

    public void setBedTime(LocalTime bedTime) {
        this.bedTime = bedTime;
    }

    public LocalTime getWakeTime() {
        return wakeTime;
    }

    public void setWakeTime(LocalTime wakeTime) {
        this.wakeTime = wakeTime;
    }

    public LocalDate getSleepDate() {
        return sleepDate;
    }

    public void setSleepDate(LocalDate sleepDate) {
        this.sleepDate = sleepDate;
    }
}
