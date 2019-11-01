package com.dz.pojo;

public class SafterSale {
    //售后表
    private Integer id;
    private Integer orderMasterId; // 订单编号id
    private String createTime;//申请时间
    private Integer userLoginId;//用户id

    //订单 一对一
    private  OrderMaster orderMaster;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderMasterId() {
        return orderMasterId;
    }

    public void setOrderMasterId(Integer orderMasterId) {
        this.orderMasterId = orderMasterId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public OrderMaster getOrderMaster() {
        return orderMaster;
    }

    public void setOrderMaster(OrderMaster orderMaster) {
        this.orderMaster = orderMaster;
    }

    public Integer getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }
}
