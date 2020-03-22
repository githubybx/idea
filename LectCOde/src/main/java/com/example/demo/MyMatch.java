package com.example.demo;

public class MyMatch {
    public static void main(String[] args) {
        System.out.println(match("ab".toCharArray(), "a.c*d*".toCharArray()));
    }
    public static boolean match(char[] str, char[] pattern)
    {  if(str == null && pattern == null) {
         return true;
    }
       if(str.length == 0 && pattern.length == 0){
           return true;
       }
       int start = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i]!= pattern[start]){
                if(pattern[start] == '.'){
                    if(start + 1 <= pattern.length - 1){
                    start++;
                    }else {
                        return false;
                    }
                }
                else if(pattern[start] == '*'){
                     if(start - 1 >= 0){
                         while (i <= str.length - 2 && str[i] == pattern[start-1]){
                            i++;
                         }
                        if(i == str.length - 1 && start != pattern.length-1){
                            return false;
                        }else if(start != pattern.length-1){
                            start ++;
                        }
                    }
                }
                else {
                    return false;
                }
            }else {
                if (start + 1 <= pattern.length - 1) {
                    start++;
                } else {
                    return false;
                }
            }
        }
        if(start != pattern.length - 1){
            return false;
        }
        return true;
    }
}
