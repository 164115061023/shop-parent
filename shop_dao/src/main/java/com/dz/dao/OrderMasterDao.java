package com.dz.dao;

import com.dz.pojo.OrderMaster;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMasterDao {
    //通过订单id查找订单
    @Select("select id,orderno orderNo,user_login_id userLoginId,address_id addressId," +
            "payment_method paymentMethod,discount_money discountMoney," +
            "shopping_money  shoppingMoney,payment_money paymentMoney,shopping_card_id shoppingCartId," +
            "create_time createTime,pay_time payTime,receive_time receiveTime,order_status orderStatus," +
            "order_point orderPoint from order_master where id = #{id}")
    OrderMaster findById(Integer id);

    //通过userLoginId查找订单
    @Select("select id,orderno orderNo,user_login_id userLoginId,address_id addressId," +
            "payment_method paymentMethod,discount_money discountMoney," +
            "shopping_money  shoppingMoney,payment_money paymentMoney,shopping_card_id shoppingCartId," +
            "create_time createTime,pay_time payTime,receive_time receiveTime,order_status orderStatus," +
            "order_point orderPoint from order_master where  user_login_id = #{userLoginId} AND order_status = '申请退款' OR order_status = '卖家已退款' OR order_status = '退款中'")
    List<OrderMaster> fingByUserLoginId(Integer userLoginId);



    //多表联查获取    商品名称
    @Select("SELECT product_name productName FROM product p JOIN order_subsidiary o JOIN order_master om ON p.id = o.product_id AND om.id = o.order_id WHERE om.id = #{id}")

    List<String> findProductName(Integer id);


}
