package com.example.week6day2analytics.pojos;

public class Timesheet {
    private float payRate;
    private boolean isHourly;
    private float currentHours;

    public Timesheet() {
    }

    public Timesheet(float payRate, boolean isHourly, float currentHours) {
        this.payRate = payRate;
        this.isHourly = isHourly;
        this.currentHours = currentHours;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }

    public float getCurrentHours() {
        return currentHours;
    }

    public void setCurrentHours(float currentHours) {
        this.currentHours = currentHours;
    }
}
