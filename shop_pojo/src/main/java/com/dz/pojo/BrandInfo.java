package com.dz.pojo;

public class BrandInfo {
    //品牌信息
    private Integer id;
    private String brandName;//品牌名
    private String brandLogo;//品牌LOGO路径
    private String brandDesc;//品牌描述
    private String telephone;//电话



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLoge) {
        this.brandLogo = brandLoge;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
