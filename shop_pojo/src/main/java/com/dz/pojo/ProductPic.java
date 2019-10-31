package com.dz.pojo;

public class ProductPic {
    private Integer id;
    private Integer productId;
    private String picDesc;
    private String path;
    private Integer picOrder;

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

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPicOrder() {
        return picOrder;
    }

    public void setPicOrder(Integer picOrder) {
        this.picOrder = picOrder;
    }
}
