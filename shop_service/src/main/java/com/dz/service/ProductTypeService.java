package com.dz.service;

import com.dz.dao.ProductTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeDao productTypeDao;
}
