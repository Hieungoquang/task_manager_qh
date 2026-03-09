package com.ngoquanghieu.task_manager_qh.model;

public class User {
    private String user_id;
    private String username;
    private String email;
    private String phone_number;
    private String provider_id;
    private String provider_name;
    private String avatar_url;
    private String full_name;
    private long last_sync_at;
    private long created_at;
    private long updated_at;

    public User(){}

    public User(String user_id, String username, String email, String phone_number
    , String provider_id, String provider_name, String avatar_url, String full_name, long last_sync_at
    , long created_at, long updated_at){
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.phone_number = phone_number;
        this.provider_id = provider_id;
        this.provider_name = provider_name;
        this.avatar_url = avatar_url;
        this.full_name = full_name;
        this.last_sync_at = last_sync_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getProvider_id() {
        return provider_id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getFull_name() {
        return full_name;
    }

    public long getLast_sync_at() {
        return last_sync_at;
    }

    public long getCreated_at() {
        return created_at;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setProvider_id(String provider_id) {
        this.provider_id = provider_id;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setLast_sync_at(long last_sync_at) {
        this.last_sync_at = last_sync_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }
}
