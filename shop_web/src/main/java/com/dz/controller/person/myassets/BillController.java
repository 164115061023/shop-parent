package com.dz.controller.person.myassets;

import com.dz.pojo.ProductUserCoupon;
import com.dz.pojo.UserLogin;
import com.dz.service.ProductUserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/person/myassets")
// 我的资产
public class BillController {
    @Autowired
    //优惠券
    private ProductUserCouponService productUserCouponService;

    //跳转到优惠劵页面
    @RequestMapping("/coupon")
    public String coupon( Model model, HttpSession session) throws ParseException {
        //通过session获取userLoginId
        UserLogin userLogin = (UserLogin) session.getAttribute("userLogin");
        //查询用户内所有优惠券Coupon
        List<ProductUserCoupon> productUserCouponList = productUserCouponService.findAllByUserLoginId(userLogin.getId());
        //获取当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前时间
        String d = sdf.format(date);
        //转换为日期格式
        Date date1 = sdf.parse(d);

        //判断优惠券时间是否在有效期内
        for (ProductUserCoupon puc :productUserCouponList){

            //将开始与结束时间转换为日期格式
            Date starTime = sdf.parse(puc.getStartTime());
            Date endTime = sdf.parse(puc.getEndTime());

            //判断当前日期是否大于开始日期 并且小于结束日期
            if (starTime.getTime()<date1.getTime()&&endTime.getTime()>date1.getTime()){
                //System.out.println("没过期");
                //判定优惠券是否已使用
                if (1 != puc.getCouponState()){
                     //放入未过期且未使用 的优惠券集合
                     List<ProductUserCoupon> validityList = new ArrayList<>();
                     validityList.add(puc);
                    //向页面传值
                    model.addAttribute("validityList",validityList);

                }else {
                    //放入未过期且已使用 的优惠券集合
                    List<ProductUserCoupon> usedList = new ArrayList<>();
                    usedList.add(puc);
                    //向页面传值
                    model.addAttribute("usedList",usedList);
                }

            }else {
                //System.out.println("已过期");
                //放入已过期的优惠券集合
                List<ProductUserCoupon> outOfDateList = new ArrayList<>();
                outOfDateList.add(puc);
                //向页面传值
                model.addAttribute("outOfDateList",outOfDateList);
            }

        }


        return "person/myassets/coupon";
    }


    //跳转到红包页面
    @RequestMapping("/bonus")
    public String bonus(){



        return "person/myassets/bonus";
    }


    //跳转到账单明细页面
    @RequestMapping("/bill")
    public String bill(){
        return "person/myassets/bill";
    }
    //跳转到查看收入明细页面
    @RequestMapping("/billlist")
    public String billlist(){
        return "person/myassets/billlist";
    }


}
