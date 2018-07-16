package com.hansonding.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String userFlag;
    private Date pwdUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public Date getPwdUpdate() {
        return pwdUpdate;
    }

    public void setPwdUpdate(Date pwdUpdate) {
        this.pwdUpdate = pwdUpdate;
    }
}
