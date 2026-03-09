package com.ngoquanghieu.task_manager_qh.model;

public class TaskSchedule {
    private String scheduleId;
    private String taskId;
    private String availabilityId;
    private long startDatetime;
    private long endDatetime;
    private int durationMinutes;
    private String status;
    private int scoreHeuristic;
    private boolean isAutoSplit;
    private long createdAt;
    private long updatedAt;

    public TaskSchedule() {}

    public TaskSchedule(String scheduleId, String taskId, String availabilityId, long startDatetime,
                        long endDatetime, int durationMinutes, String status, int scoreHeuristic,
                        boolean isAutoSplit, long createdAt){
        this.scheduleId = scheduleId;
        this.taskId = taskId;
        this.availabilityId = availabilityId;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.durationMinutes = durationMinutes;
        this.status = status;
        this.scoreHeuristic = scoreHeuristic;
        this.isAutoSplit = isAutoSplit;
        this.createdAt = createdAt;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAvailabilityId() {
        return availabilityId;
    }

    public void setAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
    }

    public long getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(long startDatetime) {
        this.startDatetime = startDatetime;
    }

    public long getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(long endDatetime) {
        this.endDatetime = endDatetime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getScoreHeuristic() {
        return scoreHeuristic;
    }

    public void setScoreHeuristic(int scoreHeuristic) {
        this.scoreHeuristic = scoreHeuristic;
    }

    public boolean isAutoSplit() {
        return isAutoSplit;
    }

    public void setAutoSplit(boolean autoSplit) {
        isAutoSplit = autoSplit;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
