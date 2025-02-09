package com.github.saiaaaaaaa.cod.normal;

import com.github.saiaaaaaaa.cod._c;

import java.util.Date;

public class Check {
    public static boolean hasSymbols(String str){
        return _c._c0(str);
    }

    public static boolean hasNumbers(String str){
        return _c._c5(str);
    }

    public static boolean hasSpaces(String str){
        return _c._c10(str);
    }

    public static double howManySecondsLeft(Date now, Date until){
        return _c._c13(now, until);
    }

    public static double howManyMinutesLeft(Date now, Date until){
        return _c._c16(now, until);
    }

    public static double howManyHoursLeft(Date now, Date until){
        return _c._c19(now, until);
    }

    public static double howManyDaysLeft(Date now, Date until){
        return _c._c22(now, until);
    }
}
