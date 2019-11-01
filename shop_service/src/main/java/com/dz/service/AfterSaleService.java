package com.dz.service;

import com.dz.dao.AfterSaleDao;
import com.dz.pojo.AfterSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfterSaleService {

    @Autowired
    private AfterSaleDao afterSaleDao;

    //通过userid获取售后信息
    public List<AfterSale> findByUserLoginId(Integer userLoginId){
        return afterSaleDao.findByUserLoginId(userLoginId);
    }



}
