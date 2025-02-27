package com.example.magicMomentsEventManagementApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String userPhNo;
    private String userEmail;
    private String password;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserPhNo() {
        return userPhNo;
    }
    public void setUserPhNo(String userPhNo) {
        this.userPhNo = userPhNo;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserModel(Long userId, String username, String userPhNo, String userEmail, String password) {
        this.userId = userId;
        this.username = username;
        this.userPhNo = userPhNo;
        this.userEmail = userEmail;
        this.password = password;
    }
    public UserModel() {}
}
