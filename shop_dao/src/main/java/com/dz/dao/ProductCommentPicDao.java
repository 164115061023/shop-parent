package com.dz.dao;

import com.dz.pojo.ProductCommentPic;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductCommentPicDao {

    //通过评价id找照片
    @Select("select pic from product_comment_pic where product_comment_id = #{productCommentId}")
    List<ProductCommentPic> findByProductCommentId(Integer productCommentId);
}
