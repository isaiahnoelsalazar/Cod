package com.github.saiaaaaaaa.cod;

import java.util.Date;

public class Check {
    public static boolean hasSymbols(String str){
        String symbols = "~`!@#$%^&*()_+-=[]{}\\|'\";:,.<>/?";
        for (int a = 0; a < str.length(); a++){
            for (int _c4 = 0; _c4 < symbols.length(); _c4++){
                if (str.charAt(a) == symbols.charAt(_c4)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasNumbers(String str){
        String numbers = "0123456789";
        for (int a = 0; a < str.length(); a++){
            for (int b = 0; b < numbers.length(); b++){
                if (str.charAt(a) == numbers.charAt(b)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSpaces(String str){
        for (int a = 0; a < str.length(); a++){
            if (str.charAt(a) == ' '){
                return true;
            }
        }
        return false;
    }

    public static double howManySecondsLeft(Date now, Date until){
        return new Date(until.getTime() - now.getTime()).getTime() / 1000.0;
    }

    public static double howManyMinutesLeft(Date now, Date until){
        return new Date(until.getTime() - now.getTime()).getTime() / 60000.0;
    }

    public static double howManyHoursLeft(Date now, Date until){
        return new Date(until.getTime() - now.getTime()).getTime() / 60000.0 / 60.0;
    }

    public static double howManyDaysLeft(Date now, Date until){
        return new Date(until.getTime() - now.getTime()).getTime() / 60000.0 / 60.0 / 24.0;
    }
}
