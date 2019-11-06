package com.dz.pojo;

import java.util.List;

public class UserLogin {
    //user登录表
    private Integer id;

    private String username;
    private String password;
    private String status;

    private List<Address> addressList;//地址信息 一对多关系

    private UserLevel userLevel;//一对一关系
    private UserMessage userMessage;//一对一关系

    //商品评论表   一对多
    private List<ProductComment> productCommentList;
    //订单 多对一
    private List<OrderMaster> orderMasterList;
    //购物车 多对一
    private List<ShoppingCart> shoppingCartList;
    //优惠券 多对一
    private List<ProductUserCoupon> productUserCoupons;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public UserLevel getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    public UserMessage getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(UserMessage userMessage) {
        this.userMessage = userMessage;
    }

    public List<ProductComment> getProductCommentList() {
        return productCommentList;
    }

    public void setProductCommentList(List<ProductComment> productCommentList) {
        this.productCommentList = productCommentList;
    }

    public List<OrderMaster> getOrderMasterList() {
        return orderMasterList;
    }

    public void setOrderMasterList(List<OrderMaster> orderMasterList) {
        this.orderMasterList = orderMasterList;
    }

    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<ShoppingCart> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public List<ProductUserCoupon> getProductUserCoupons() {
        return productUserCoupons;
    }

    public void setProductUserCoupons(List<ProductUserCoupon> productUserCoupons) {
        this.productUserCoupons = productUserCoupons;
    }
}
