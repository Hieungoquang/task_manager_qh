package com.ngoquanghieu.task_manager_qh.model;

import com.google.type.DateTime;

public class UserAvailability {
    private String availability_id;
    private String user_id;
    private long date;
    private long startTime;
    private long endTime;
    private int durationMinutes;
    private boolean isRecurring;
    private int dayOfWeek;
    private long createdAt;

    public UserAvailability() {}

    public UserAvailability(String availability_id, String user_id, long date, long startTime,
                            long endTime, int durationMinutes, boolean isRecurring, int dayOfWeek,
                            long createdAt) {
        this.availability_id = availability_id;
        this.user_id = user_id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationMinutes = durationMinutes;
        this.isRecurring = isRecurring;
        this.dayOfWeek = dayOfWeek;
        this.createdAt = createdAt;
    }

    public String getAvailability_id() {
        return availability_id;
    }

    public void setAvailability_id(String availability_id) {
        this.availability_id = availability_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
