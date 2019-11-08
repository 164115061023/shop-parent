package com.dz.dao;

import com.dz.pojo.ProductUserCoupon;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductUserCouponDao {
    //通过用户id查询所有优惠券
    @Select("select id,coupons_name couponsName,couponsno couponsNo,money,user_login_id userLoginId,start_time startTime,end_time endTime,coupon_state couponState,limits from product_user_coupon where user_login_id = #{userLoginId}")
    List<ProductUserCoupon> findAllByUserLoginId(Integer userLoginId);




}
