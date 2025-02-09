package com.github.saiaaaaaaa.cod;

import java.util.Date;

public class _c {
    public static boolean _c0(String _c1){
        String _c2 = "~`!@#$%^&*()_+-=[]{}\\|'\";:,.<>/?";
        for (int _c3 = 0; _c3 < _c1.length(); _c3++){
            for (int _c4 = 0; _c4 < _c2.length(); _c4++){
                if (_c1.charAt(_c3) == _c2.charAt(_c4)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean _c5(String _c6){
        String _c7 = "0123456789";
        for (int _c8 = 0; _c8 < _c6.length(); _c8++){
            for (int _c9 = 0; _c9 < _c7.length(); _c9++){
                if (_c6.charAt(_c8) == _c7.charAt(_c9)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean _c10(String _c11){
        for (int _c12 = 0; _c12 < _c11.length(); _c12++){
            if (_c11.charAt(_c12) == ' '){
                return true;
            }
        }
        return false;
    }
    public static double _c13(Date _c14, Date _c15){
        return new Date(_c15.getTime() - _c14.getTime()).getTime() / 1000.0;
    }
    public static double _c16(Date _c17, Date _c18){
        return new Date(_c18.getTime() - _c17.getTime()).getTime() / 60000.0;
    }
    public static double _c19(Date _c20, Date _c21){
        return new Date(_c21.getTime() - _c20.getTime()).getTime() / 60000.0 / 60.0;
    }
    public static double _c22(Date _c23, Date _c24){
        return new Date(_c24.getTime() - _c23.getTime()).getTime() / 60000.0 / 60.0 / 24.0;
    }
}
