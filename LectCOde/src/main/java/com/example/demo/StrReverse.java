package com.example.demo;

import java.util.ArrayList;
import java.util.Stack;

public class StrReverse {
    public static void main(String[] args) {
        String Str = " ";
        System.out.println(Str.length());
        System.out.println(reverse("I am a student."));
    }
    public static String reverse(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        String[] s = str.split(" ");
        String string = new String();
        for (int i = s.length - 1; i >= 0; i--) {
            string += s[i] + " ";
        }
       return string;
    }
}
