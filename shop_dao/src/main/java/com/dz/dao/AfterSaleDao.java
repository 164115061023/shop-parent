package com.dz.dao;

import com.dz.pojo.AfterSale;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AfterSaleDao {

    //通过userid获取售后信息
    //@Select("select id,order_master_id orderMasterId,createtime createTime ,user_login_id userLoginId from after_sale where user_login_id = #{userLoginId} ")
    //List<AfterSale> findByUserLoginId(Integer userLoginId);

    //多表联查 售后表 订单表 产品表 获取售后信息
    @Select("SELECT a.id,a.createtime createTime,o.payment_money paymentMoney ,o.payment_method  paymentMethod ,o.orderno orderNo,p.product_pack productPack,p.product_name productName,p.descript descript  FROM after_sale a LEFT JOIN order_master o  ON a.order_master_id = o.id JOIN product p ON o.product_id = p.id WHERE a.user_login_id = #{userLoginId}")
    List<AfterSale> findByUserLoginId(Integer userLoginId);

    // 售后与订单表联查


}
