package com.example.demo;

import java.util.regex.Pattern;

public class Login {
    public static void main(String[] args) {
      judje();
    }
    public static void judje(){
        Pattern compile = Pattern.compile("[0-9]{6,12}@qq.com");
        System.out.println(compile.matcher("401129874@qq.com").matches());
    }
}
