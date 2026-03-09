package com.ngoquanghieu.task_manager_qh.model;

public class Subtask {
    private int subtask_id;
    private int task_id;
    private String title;
    private boolean is_completed;
    private long created_at;

    public Subtask(){}

    public Subtask(int subtask_id, int task_id, String title, boolean is_completed, long created_at){
        this.subtask_id = subtask_id;
        this.task_id = task_id;
        this.title = title;
        this.is_completed = is_completed;
        this.created_at = created_at;
    }

    public int getSubtask_id() {
        return subtask_id;
    }

    public void setSubtask_id(int subtask_id) {
        this.subtask_id = subtask_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }
}
