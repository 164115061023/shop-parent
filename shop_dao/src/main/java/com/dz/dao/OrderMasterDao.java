package com.dz.dao;

import com.dz.pojo.OrderMaster;
import org.apache.ibatis.annotations.Select;

public interface OrderMasterDao {
    //通过订单id查找订单
    @Select("select id,orderno orderNo,user_login_id userLoginId,address_id addressId," +
            "payment_method paymentMethod,discount_money discountMoney," +
            "shopping_money  shoppingMoney,payment_money paymentMoney,shopping_card_id shoppingCartId," +
            "create_time createTime,pay_time payTime,receive_time receiveTime,order_status orderStatus," +
            "order_point orderPoint from order_master where id = #{id}")
    OrderMaster findById(Integer id);



}
