package com.dz.pojo;

import java.util.List;

public class Product {
    //产品信息
    private Integer id;

    private String productName;//产品名称
    private Integer typeId;//产品类别
    private Double original_price;//原价格
    private Double current_price;//现价格
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

    private Integer productTypeId;//类别
    private String size;//尺码
    private String color;//颜色
    private String pack;//包装
    //private Integer productTypeId;//类别
    private String pic;//商品主图片
    private String priority;//优先级
    private String title1;
    private String title2;

    //多对一
    private ProductType productType; //产品类别

    //品牌一对一


    //商品多对一 订单
    private OrderSubsidiary OrderSubsidiary;

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

    public Double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Double original_price) {
        this.original_price = original_price;
    }

    public Double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(Double current_price) {
        this.current_price = current_price;
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

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public com.dz.pojo.OrderSubsidiary getOrderSubsidiary() {
        return OrderSubsidiary;
    }

    public void setOrderSubsidiary(com.dz.pojo.OrderSubsidiary orderSubsidiary) {
        OrderSubsidiary = orderSubsidiary;
    }

    public List<ProductComment> getProductCommentList() {
        return productCommentList;
    }

    public void setProductCommentList(List<ProductComment> productCommentList) {
        this.productCommentList = productCommentList;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
