package com.dz.service;

import com.dz.dao.BrandInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandInfoService {

    @Autowired
    private BrandInfoDao brandInfoDao;
}
