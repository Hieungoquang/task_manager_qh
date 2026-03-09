package com.ngoquanghieu.task_manager_qh.model;

import com.google.type.DateTime;

public class Task {
    private String task_id;
    private String user_id;
    private String title;
    private String description;
    private DateTime due_date;
    private String priority;
    private String status;
    private int progress;
    private double estimated_time;
    private double actual_time;
    private long created_at;
    private long updated_at;

    public Task(){}

    public Task(String task_id, String user_id, String title, String description, DateTime due_date,
                String priority, String status, int progress, double estimated_time,
                double actual_time, long created_at, long updated_at){
        this.task_id = task_id;
        this.user_id = user_id;
        this.title = title;
        this.description = description;
        this.due_date = due_date;
        this.priority = priority;
        this.status = status;
        this.progress = progress;
        this.estimated_time = estimated_time;
        this.actual_time = actual_time;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getTask_id() {
        return task_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public DateTime getDue_date() {
        return due_date;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public double getEstimated_time() {
        return estimated_time;
    }

    public double getActual_time() {
        return actual_time;
    }

    public long getCreated_at() {
        return created_at;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDue_date(DateTime due_date) {
        this.due_date = due_date;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setEstimated_time(double estimated_time) {
        this.estimated_time = estimated_time;
    }

    public void setActual_time(double actual_time) {
        this.actual_time = actual_time;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }
}
