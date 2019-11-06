package com.dz.pojo;

import java.util.List;

public class Product {
    //产品信息
    private Integer id;

    //private String productCore;//产品核心

    private String productName;//产品名称
    private Integer typeId;//产品类别
    //private Integer supplierId;//供应商id
    private Double price;//价格
    private String publishStatus;//商品状态（出售中/已下架）
    //private Double weight;//重量
    //private Double length;//长
    //private Double height;//高
    //private Double width;//宽
    //private String colorType;//颜色
    //private String productionDate;//商品生产日期
    //private String shelfLife;//保质期
    private String descript;//商品描述
    private Integer brandId;//品牌
    private Integer stock;//库存
    //private Integer productTypeId;//类别
    private String priority;//优先级


    //多对一
    private ProductType productType; //产品类别

    //品牌一对一


    //商品多对一 订单
    private OrderMaster orderMaster;

    //产品评论一对多
    private List<ProductComment> productCommentList;
    //购物券  一对一
    private ShoppingCart shoppingCart;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }



}
