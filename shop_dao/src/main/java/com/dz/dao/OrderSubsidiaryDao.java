package com.dz.dao;

import com.dz.pojo.OrderSubsidiary;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface OrderSubsidiaryDao {
    //
    @Select("select * from order_subsidiary where order_id = #{orderId}")
    List<OrderSubsidiary> findByOrderId(Integer orderId);
}
