package com.dz.service;

import com.dz.dao.ProductCommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentDao productCommentDao;
}
