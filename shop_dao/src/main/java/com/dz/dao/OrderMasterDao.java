package com.dz.dao;

import com.dz.pojo.OrderMaster;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMasterDao {
    //通过订单id查找订单
    @Select("select * from order_master where id = #{id}")
    @Results({
            @Result(column = "orderno",property = "orderNo"),
            @Result(column = "user_login_id",property = "userLoginId"),
            @Result(column = "address_id",property = "addressId"),
            @Result(column = "payment_method",property = "paymentMethod"),
            @Result(column = "discount_money",property = "discountMoney"),
            @Result(column = "shopping_money",property = "shoppingMoney"),
            @Result(column = "payment_money",property = "paymentMoney"),
            @Result(column = "shopping_card_id",property = "shoppingCardId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "pay_time",property = "payTime"),
            @Result(column = "receive_time",property = "receiveTime"),
            @Result(column = "order_status",property = "orderStatus"),
            @Result(column = "order_point",property = "orderPoint")
    })

    OrderMaster findById(Integer id);

    //通过userLoginId查找订单
    @Select("select * from order_master where  user_login_id = #{userLoginId} AND order_status = '申请退款' OR order_status = '卖家已退款' OR order_status = '退款中'")
    @Results({
            @Result(column = "orderno",property = "orderNo"),
            @Result(column = "user_login_id",property = "userLoginId"),
            @Result(column = "address_id",property = "addressId"),
            @Result(column = "payment_method",property = "paymentMethod"),
            @Result(column = "discount_money",property = "discountMoney"),
            @Result(column = "shopping_money",property = "shoppingMoney"),
            @Result(column = "payment_money",property = "paymentMoney"),
            @Result(column = "shopping_card_id",property = "shoppingCardId"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "pay_time",property = "payTime"),
            @Result(column = "receive_time",property = "receiveTime"),
            @Result(column = "order_status",property = "orderStatus"),
            @Result(column = "order_point",property = "orderPoint")
    })

    List<OrderMaster> fingByUserLoginId(Integer userLoginId);



    //多表联查获取    商品名称
    @Select("SELECT product_name productName FROM product p JOIN order_subsidiary o JOIN order_master om ON p.id = o.product_id AND om.id = o.order_id WHERE om.id = #{id}")

    List<String> findProductName(Integer id);


}
