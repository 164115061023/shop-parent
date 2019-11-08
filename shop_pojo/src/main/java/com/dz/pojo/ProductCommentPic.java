package com.dz.pojo;

public class ProductCommentPic {
    //评论照片
    private Integer id;
    private Integer productCommentId;//评论id
    private String pic;//照片名称

    //评论 一对多
    private ProductComment productComment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductCommentId() {
        return productCommentId;
    }

    public void setProductCommentId(Integer productCommentId) {
        this.productCommentId = productCommentId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ProductComment getProductComment() {
        return productComment;
    }

    public void setProductComment(ProductComment productComment) {
        this.productComment = productComment;
    }
}
