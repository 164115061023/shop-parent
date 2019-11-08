package com.dz.service;

import com.dz.dao.AddressDao;
import com.dz.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressDao addressDao;
    //查询地址
    public Address findByUid(Integer userLoginId){
        return addressDao.findByUid(userLoginId);
    }
    //修改地址
    public void updateAddress(String province,String city,String district){
        addressDao.updateAddress(province,city,district);
    }
    public void updateMd(Address address){
        addressDao.updateMd(address);
    }
    //删除地址
    public void deleteById(Integer id){
        addressDao.deleteById(id);
    }
    //省市县
    public void updateContent(String content){
        addressDao.updateContent(content);
    }
}
