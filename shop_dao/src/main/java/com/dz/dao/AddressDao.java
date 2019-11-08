package com.dz.dao;

import com.dz.pojo.Address;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AddressDao {
    //查询地址
    @Select("select id,user_login_id as userLoginId,province,city,district,detailaddress from address where user_login_id =#{userLoginId}")
    Address findByUid(Integer userLoginId);
    //修改地址
    @Update("update address set province=#{province},city=#{city},district=#{district}")
    void updateAddress(@Param("province") String province, @Param("city") String city,@Param("district") String district);
    //收货人，手机号，详细地址
    @Update("update address set consignee=#{consignee},phone=#{phone},detailaddress=#{detailaddress} where user_login_id=#{userLoginId}")
    void updateMd(Address address);
    //删除地址
    @Delete("delete consigon,phone,province,city,district,detailaddress where id=#{id}")
    void deleteById(Integer id);
    //省市县结合
    @Update("update address set content=#{content}")
    void updateContent(String content);
}
