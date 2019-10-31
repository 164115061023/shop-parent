package com.dz.pojo;

public class UserLevel {
    //user等级表
    private Integer id;
    private String levelName; //等级名称
    private Integer point;//积分
    private String becomeTime;//成为会员时间
    private String endTime; //会员结束时间
    private Integer userLoginId;//user登录id

    //一对一
    private UserLogin userLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getBecomeTime() {
        return becomeTime;
    }

    public void setBecomeTime(String becomeTime) {
        this.becomeTime = becomeTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
}
