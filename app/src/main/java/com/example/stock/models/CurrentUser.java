package com.example.stock.models;

public class CurrentUser {
    private String email;
    private String password;

    @Override
    public String toString() {
        return "CurrentUser{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public CurrentUser(String email, String password) {
        this.email = email;
        this.password = password;
    }
}