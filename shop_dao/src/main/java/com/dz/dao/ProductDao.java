package com.dz.dao;

import com.dz.pojo.Product;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    //通过id找商品
    @Select("select * from product product where id=#{id}")
    @Results({
            @Result(property = "productName",column = "product_name")
            ,@Result(property = "typeId",column = "type_id")
            ,@Result(property = "brandId",column = "brand_id")
    })
    Product findById(Integer id);


    @Select("select * from product where priority='今日推荐'")
    @Results({
            @Result(property = "productName",column = "product_name")
            ,@Result(property = "typeId",column = "type_id")
            ,@Result(property = "brandId",column = "brand_id")
    })
    List<Product> findByRecommend();
}
