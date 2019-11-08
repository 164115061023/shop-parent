package com.dz.dao;

import com.dz.pojo.OrderSubsidiary;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface OrderSubsidiaryDao {
    //通过订单id获取商品信息
    @Select("select * from order_subsidiary where order_id = #{orderId}")
    @Results({
            @Result(column = "order_id",property = "orderId"),
            @Result(column = "product_id",property = "productId"),
            @Result(column = "product_id",property = "product",one=@One(select = "com.dz.dao.ProductDao.findById"))
    })
    List<OrderSubsidiary> findByOrderId(Integer orderId);
}
