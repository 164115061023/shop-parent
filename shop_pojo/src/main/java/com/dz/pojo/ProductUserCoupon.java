package com.dz.pojo;

public class ProductUserCoupon {
    //用户优惠券
    private Integer id;
    private String couponsName;//优惠券名称
    private String couponsNo;//优惠券编号
    private Double money;//优惠金额
    private Integer userLoginId;//用户id
    private String startTime;//优惠开始日期
    private String endTime;//结束时间
    private Integer couponState;//优惠券状态
    private Integer limits;//使用限制

    //用户 一对多
    private UserLogin userLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponsName() {
        return couponsName;
    }

    public void setCouponsName(String couponsName) {
        this.couponsName = couponsName;
    }

    public String getCouponsNo() {
        return couponsNo;
    }

    public void setCouponsNo(String couponsNo) {
        this.couponsNo = couponsNo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getCouponState() {
        return couponState;
    }

    public void setCouponState(Integer couponState) {
        this.couponState = couponState;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Integer getLimits() {
        return limits;
    }

    public void setLimits(Integer limits) {
        this.limits = limits;
    }
}
