package com.example.demo;


public class StrStream {
    static String str = "";
    static int[] array = new int[256];
    public static void main(String[] args) {
        Insert('h');
        FirstAppearingOnce();
        Insert('e');
        FirstAppearingOnce();
        Insert('l');
        FirstAppearingOnce();
        Insert('l');
        FirstAppearingOnce();
        Insert('o');
        FirstAppearingOnce();
        Insert('w');
        FirstAppearingOnce();
    }
    public static void Insert(char ch)
    {
        str += ch;
        array[ch]++;
    }
    public static char FirstAppearingOnce()
    {
        if(str == null || str.length() == 0){
            return '#';
        }
        for(int i=0; i < str.length(); i++){
            if(array[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                return str.charAt(i);
            }
        }
        System.out.println('#');
        return '#';
    }
}
