package com.dz.service;

import com.dz.dao.OrderMasterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMasterService {
    @Autowired
    private OrderMasterDao orderMasterDao;
}
