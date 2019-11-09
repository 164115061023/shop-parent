package com.dz.pojo;

import java.util.List;

public class OrderMaster {
    //订单
    private Integer id;
    private String orderNo;//订单编号
    private Integer userLoginId;//userId
    private Integer addressId;//地址
    private String paymentMethod;//付款方式
    private Double discountMoney;//折扣价
    private Double shoppingMoney;//原价
    private Double paymentMoney;//应付总金额
    private Integer shoppingCardId;//购物券编号
    private String createTime;//创建时间
    private String payTime;//下单时间
    private String receiveTime;//收货时间
    private String orderStatus;//订单状态
    private Double orderPoint;//购物积分
    private Integer productId;//商品Id


    //user一对多
    private UserLogin userLogin;
    //地址 一对一
    private Address address;
    //购物券 一对一
    private ShoppingCart shoppingCart;
    //售后 一对一
    private AfterSale afterSale;
    //订单辅表 多对一
    private List<OrderSubsidiary> orderSubsidiaryList;

   /* //商品  多对订单一
    private List<Product> productList;*/


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Double getShoppingMoney() {
        return shoppingMoney;
    }

    public void setShoppingMoney(Double shoppingMoney) {
        this.shoppingMoney = shoppingMoney;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Integer getShoppingCardId() {
        return shoppingCardId;
    }

    public void setShoppingCardId(Integer shoppingCardId) {
        this.shoppingCardId = shoppingCardId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(Double orderPoint) {
        this.orderPoint = orderPoint;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public AfterSale getAfterSale() {
        return afterSale;
    }

    public void setAfterSale(AfterSale afterSale) {
        this.afterSale = afterSale;
    }

    public List<OrderSubsidiary> getOrderSubsidiaryList() {
        return orderSubsidiaryList;
    }

    public void setOrderSubsidiaryList(List<OrderSubsidiary> orderSubsidiaryList) {
        this.orderSubsidiaryList = orderSubsidiaryList;
    }
}
