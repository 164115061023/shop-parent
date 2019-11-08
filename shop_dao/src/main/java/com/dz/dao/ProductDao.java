package com.dz.dao;

import com.dz.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    //通过id找商品
    @Select("select id,product_name productName,type_id typeId,price,publish_status publishStatus, descript,brand_id brandId,stock,priority from product where id = #{id}")
    Product findById(Integer id);

    //通过userid获得评论
    @Select("select * from product where user_id = #{userId} ")
    List<Product> findByUserId(Integer userId);

}
