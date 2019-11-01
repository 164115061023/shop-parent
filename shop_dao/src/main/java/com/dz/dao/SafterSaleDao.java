package com.dz.dao;

import com.dz.pojo.SafterSale;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SafterSaleDao {

    //通过userid获取售后信息
    @Select("select id,order_master_id orderMasterId,create_time createTime ,user_login_id userLoginId from  safter_sale where user_login_id = #{userLoginId} ")
    List<SafterSale> fingByUserLoginId(Integer userLoginId);

}
