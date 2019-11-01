package com.dz.service;

import com.dz.dao.SafterSaleDao;
import com.dz.pojo.SafterSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafterSaleService {

    @Autowired
    private SafterSaleDao safterSaleDao;

    //通过userid获取售后信息
    public List<SafterSale> fingByUserLoginId(Integer userLoginId){
        return safterSaleDao.fingByUserLoginId(userLoginId);
    }



}
