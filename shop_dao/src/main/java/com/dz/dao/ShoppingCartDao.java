package com.dz.dao;

import com.dz.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShoppingCartDao {


    @Select("select count(*) from shopping_cart where user_login_id=#{id}")
    Integer queryNum(Integer id);



    @Select("select * from shopping_cart where user_login_id = #{userLoginId}")
    @Results({
            @Result(id = true,property = "id",column = "id")
            ,@Result(property = "userLoginId",column = "user_login_id")
            ,@Result(property = "productAmount",column = "product_amount")

            ,@Result(property = "product",column = "product_id",many = @Many(select = "com.dz.dao.ProductDao.findById"))

    })
    List<ShoppingCart> findAllByUserLoginId(Integer userLoginId);
}
