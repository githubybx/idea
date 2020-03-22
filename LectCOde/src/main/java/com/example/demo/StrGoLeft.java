package com.example.demo;

public class StrGoLeft {
    public static void main(String[] args) {
        System.out.println(GoLeft("1234", 6));
    }
    public static String GoLeft(String str, int k){
        if(str.length() == 0){
            return str;
        }
        int flag = k;
        if(k == 0){
            return str;
        }
        if(k > str.length()){
            flag = k % str.length();
        }
        String substring = str.substring(0, flag);
        String remain = str.substring(flag,str.length());
        return remain + substring;
    }
}
