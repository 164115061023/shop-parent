package com.dz.service;

import com.dz.dao.OrderSubsidiaryDao;
import com.dz.pojo.OrderSubsidiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSubsidiaryService {
@Autowired
    private OrderSubsidiaryDao orderSubsidiaryDao;
    //通过通过订单id查找商品
    public  List<OrderSubsidiary> findByOrderId(Integer orderId) {
        return orderSubsidiaryDao.findByOrderId(orderId);
    }
}
