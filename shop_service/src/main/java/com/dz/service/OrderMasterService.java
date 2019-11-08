package com.dz.service;

import com.dz.dao.OrderMasterDao;
import com.dz.pojo.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMasterService {
    @Autowired
    private OrderMasterDao orderMasterDao;
    //通过订单id查找订单
    public OrderMaster findById(Integer id){
        return orderMasterDao.findById(id);
    }

    //多表联查获取    商品名称
    public List<String> findProductName(Integer id){
        return orderMasterDao.findProductName(id);
    };
    //通过userLoginId查找订单
    public List<OrderMaster> fingByUserLoginId(Integer userLoginId){
        return orderMasterDao.fingByUserLoginId(userLoginId);
    }



}
