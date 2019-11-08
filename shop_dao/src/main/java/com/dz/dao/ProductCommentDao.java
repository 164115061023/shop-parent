package com.dz.dao;


import com.dz.pojo.ProductComment;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductCommentDao {

    //通过UserLoginID查找评论
    @Select("select id,product_id productId,order_id orderMasterId,user_id userLoginId,title,content,create_time createTime from product_comment where user_id = #{userLoginId}")
    List<ProductComment> findByUserId(Integer userLoginId);



}
