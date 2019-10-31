package com.dz.service;

import com.dz.dao.ProductCouponDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCouponService {

    @Autowired
    private ProductCouponDao productCouponDao;
}
