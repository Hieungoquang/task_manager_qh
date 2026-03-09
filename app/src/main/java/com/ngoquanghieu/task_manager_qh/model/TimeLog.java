package com.ngoquanghieu.task_manager_qh.model;

public class TimeLog {
    private String log_Id;
    private String task_Id;
    private long startTime;
    private long endTime;
    private int durationMinutes;
    private String notes;
    private long createdAt;

    public TimeLog() {}

    public TimeLog(String log_Id, String task_Id, long startTime, long endTime, int durationMinutes,
                   String notes, long createdAt){
        this.log_Id = log_Id;
        this.task_Id = task_Id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationMinutes = durationMinutes;
        this.notes = notes;
        this.createdAt = createdAt;
    }

    public String getLog_Id() {
        return log_Id;
    }

    public void setLog_Id(String log_Id) {
        this.log_Id = log_Id;
    }

    public String getTask_Id() {
        return task_Id;
    }

    public void setTask_Id(String task_Id) {
        this.task_Id = task_Id;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
