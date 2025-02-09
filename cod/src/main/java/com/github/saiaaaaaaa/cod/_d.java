package com.github.saiaaaaaaa.cod;

import android.util.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class _d {
    public static String _d0(String _d1){
        return new String(Base64.encode(_d1.getBytes(StandardCharsets.UTF_8), Base64.DEFAULT));
    }
    public static String _d2(String _d3){
        try {
            return new String(Base64.decode(_d3, Base64.DEFAULT));
        } catch (Exception _d4){
            _d4.printStackTrace();
            return null;
        }
    }
    public static int _d5(String _d6){
        try {
            return Integer.parseInt(_d6);
        } catch (Exception _d7){
            _d7.printStackTrace();
            return 0;
        }
    }
    public static float _d8(String _d9){
        try {
            return Float.parseFloat(_d9);
        } catch (Exception _d10){
            _d10.printStackTrace();
            return 0;
        }
    }
    public static double _d11(String _d12){
        try {
            return Double.parseDouble(_d12);
        } catch (Exception _d13){
            _d13.printStackTrace();
            return 0;
        }
    }
    public static String _d14(Object _d15){
        return String.valueOf(_d15);
    }
    public static String _d16(Date _d17){
        return (_d17.getYear() + 1900) + "/" + (_d17.getMonth() + 1) + "/" + _d17.getDate();
    }
    public static String _d18(Date _d19){
        return _d19.getDate() + "/" + (_d19.getMonth() + 1) + "/" + (_d19.getYear() + 1900);
    }
    public static String _d20(Date _d21){
        return (_d21.getMonth() + 1) + "/" + _d21.getDate() + "/" + (_d21.getYear() + 1900);
    }
}
