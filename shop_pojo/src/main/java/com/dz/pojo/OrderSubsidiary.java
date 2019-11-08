package com.dz.pojo;

import java.util.List;

public class OrderSubsidiary {
    //订单明细表   订单辅表
    private Integer id;
    private Integer orderId;//订单id
    private Integer productId;//商品id

    //订单主表 一对多
    private OrderMaster orderMaster;
    //商品多 对一 订单辅表
    private List<Product> productList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public OrderMaster getOrderMaster() {
        return orderMaster;
    }

    public void setOrderMaster(OrderMaster orderMaster) {
        this.orderMaster = orderMaster;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
