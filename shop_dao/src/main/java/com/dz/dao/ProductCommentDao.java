package com.dz.dao;


import com.dz.pojo.ProductComment;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductCommentDao {

    //通过UserLoginID查找评论 和评论照片
    @Select("select * from product_comment where user_id = #{userLoginId}")
    @Results({
            @Result(column = "product_id" ,property = "productId"),
            @Result(column = "order_id" ,property = "orderId"),
            @Result(column = "user_id" ,property = "userLoginId"),
            @Result(column = "create_time" ,property = "createTime"),
            @Result(column = "id",property = "productCommentPicList",many = @Many(select = "com.dz.dao.ProductCommentPicDao.findByProductCommentId"))
    })

    List<ProductComment> findByUserId(Integer userLoginId);



}
