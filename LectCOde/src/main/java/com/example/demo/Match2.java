package com.example.demo;

public class Match2 {
    public static void main(String[] args) {

    }
    public static boolean isNumeric(char[] str) {
        String s = String.valueOf(str);
        return s.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
}

