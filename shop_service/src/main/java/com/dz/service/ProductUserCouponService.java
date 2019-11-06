package com.dz.service;

import com.dz.dao.ProductUserCouponDao;
import com.dz.pojo.ProductUserCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUserCouponService {

    @Autowired
    private ProductUserCouponDao productUserCouponDao;
    //通过用户ID查询用户拥有的所有优惠券
    public List<ProductUserCoupon> findAllByUserLoginId(Integer userLoginId){
        return productUserCouponDao.findAllByUserLoginId(userLoginId);
    }

}
