package com.dz.pojo;

import java.util.List;

public class ProductComment {
    //产品评论
    private Integer id;
    private Integer productId;//产品信息
    private Integer orderId;//订单id
    private Integer userLoginId;//userId
    private String title;//标题
    private String content;//内容
    private String createTime;//创建时间


    //产品一对评论多
    private Product product;
    //一对一  订单
    private OrderMaster orderMaster;
    //user一对多
    private UserLogin userLogin;
    //评论照片 多对一
    private List<ProductCommentPic> productCommentPicList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderMaster getOrderMaster() {
        return orderMaster;
    }

    public void setOrderMaster(OrderMaster orderMaster) {
        this.orderMaster = orderMaster;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public List<ProductCommentPic> getProductCommentPicList() {
        return productCommentPicList;
    }

    public void setProductCommentPicList(List<ProductCommentPic> productCommentPicList) {
        this.productCommentPicList = productCommentPicList;
    }
}
