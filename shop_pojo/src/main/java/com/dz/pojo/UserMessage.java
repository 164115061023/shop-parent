package com.dz.pojo;

public class UserMessage {
    private Integer id;
    private String name; //姓名
    private String sex;  //性别
    private String tel;  //电话
    private String email; //邮箱
    private String birthday;//出生日期
    private Integer userLoginId;//会员登录表Id
    private Integer paypassword;//支付密码
    private String idcard;//身份证号
    //一对一关系
    private UserLogin userLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public Integer getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(Integer paypassword) {
        this.paypassword = paypassword;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
