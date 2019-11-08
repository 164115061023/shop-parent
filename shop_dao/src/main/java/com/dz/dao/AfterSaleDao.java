package com.dz.dao;

import com.dz.pojo.AfterSale;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AfterSaleDao {

    //通过userid获取售后信息
    //@Select("select id,orderno orderMasterId,createtime createTime ,user_login_id userLoginId from after_sale where user_login_id = #{userLoginId} ")
    //List<AfterSale> findByUserLoginId(Integer userLoginId);

    //获取用户所有退款信息
   @Select("select id,orderno orderNo,createtime createTime,user_login_id userLoginId  from after_sale where user_login_id = #{userLoginId}")
    List<AfterSale> findByUserLoginId(Integer userLoginId);

    // 售后与订单表联查


}
