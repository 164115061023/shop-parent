package com.dz.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getDataForString(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date).toString();
    }
}
