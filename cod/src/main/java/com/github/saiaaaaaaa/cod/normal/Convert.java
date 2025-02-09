package com.github.saiaaaaaaa.cod.normal;

import com.github.saiaaaaaaa.cod._d;

import java.util.Date;

public class Convert {
    public static String toBase64(String str){
        return _d._d0(str);
    }

    public static String fromBase64(String str){
        return _d._d2(str);
    }

    public static String dateToMMDDYY(Date date){
        return _d._d20(date);
    }

    public static String dateToDDMMYY(Date date){
        return _d._d18(date);
    }

    public static String dateToYYMMDD(Date date){
        return _d._d16(date);
    }

    /*
    Note:
        The methods below exists for no reason at all. You don't need to use them. They are only
        renamed methods from already working methods.
     */
    public static int toInt(String str){
        return _d._d5(str);
    }

    public static float toFloat(String str){
        return _d._d8(str);
    }

    public static double toDouble(String str){
        return _d._d11(str);
    }

    public static String toString(Object obj){
        return _d._d14(obj);
    }
}
