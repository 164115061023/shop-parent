package com.dz.service;

import com.dz.dao.OrderMasterDao;
import com.dz.pojo.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMasterService {
    @Autowired
    private OrderMasterDao orderMasterDao;
    //通过订单id查找订单
    public OrderMaster findById(Integer id){
        return orderMasterDao.findById(id);
    }


}
