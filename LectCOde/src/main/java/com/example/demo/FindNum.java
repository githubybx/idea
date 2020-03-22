package com.example.demo;

public class FindNum {
    public static void main(String[] args) {

    }
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 0){
            return;
        }
        int[] arr = new int[2];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(LastIndexOf(array,i)){
                if(j == 2){
                    break;
                }
                arr[j++] = array[i];
            }
        }
        num1[0] = arr[0];
        num2[0] = arr[1];
    }
    public static boolean LastIndexOf(int[] array, int find){
        int begin = -1;
        int end = -1;
        for (int i = array.length - 1; i >= 0; i--){
            if(array[i] == array[find]){
                end = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[find]){
                begin = i;
                break;
            }
        }
        if(begin == end){
            return true;
        }else {
            return false;
        }
    }
}
