package com.zcy.entity;

import java.util.Date;

public class YourDiaryUser {
    private Long ydUserId;

    private String ydUsername;

    private String ydPassword;

    private String ydSalt;

    private String ydStatus;

    private String ydCreatePerson;

    private Date ydCreateTime;

    public Long getYdUserId() {
        return ydUserId;
    }

    public void setYdUserId(Long ydUserId) {
        this.ydUserId = ydUserId;
    }

    public String getYdUsername() {
        return ydUsername;
    }

    public void setYdUsername(String ydUsername) {
        this.ydUsername = ydUsername == null ? null : ydUsername.trim();
    }

    public String getYdPassword() {
        return ydPassword;
    }

    public void setYdPassword(String ydPassword) {
        this.ydPassword = ydPassword == null ? null : ydPassword.trim();
    }

    public String getYdSalt() {
        return ydSalt;
    }

    public void setYdSalt(String ydSalt) {
        this.ydSalt = ydSalt == null ? null : ydSalt.trim();
    }

    public String getYdStatus() {
        return ydStatus;
    }

    public void setYdStatus(String ydStatus) {
        this.ydStatus = ydStatus == null ? null : ydStatus.trim();
    }

    public String getYdCreatePerson() {
        return ydCreatePerson;
    }

    public void setYdCreatePerson(String ydCreatePerson) {
        this.ydCreatePerson = ydCreatePerson == null ? null : ydCreatePerson.trim();
    }

    public Date getYdCreateTime() {
        return ydCreateTime;
    }

    public void setYdCreateTime(Date ydCreateTime) {
        this.ydCreateTime = ydCreateTime;
    }
}