package com.example.demo;

import java.util.ArrayList;

public class AddSth {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array = getArray(100);
        for(ArrayList<Integer> list : array){
            for(Integer integer : list){
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> getArray(int num){
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        for (int i = num; i > 1; i--) {
            if(i % 2 == 1){
                ArrayList<Integer> array = getSingle(num, i);
                if(array != null){
                    arrayLists.add(array);
                }
            }else {
                ArrayList aDouble = getDouble(num, i);
                if(aDouble != null){
                    arrayLists.add(aDouble);
                }
            }
        }
        return arrayLists;
    }
    public static ArrayList<Integer> getDouble(int num,int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        //最中间的两个数的和必须是奇数，不是奇数则意味着不可能再分下去
        int flag = k / 2;
        if(num / flag % 2 != 1){
            return null;
        }
        //分成的每一组的和必须是整数(两个数一组)
        if(num % flag != 0){
            return null;
        }
        int mid_start = num / flag / 2;
        if(mid_start - flag + 1 <= 0){
            return null;
        }else {
            for (int i = 0; i < k; i++) {
                arrayList.add(mid_start - flag + 1 + i);
            }
        }
        return arrayList;
    }
    public static ArrayList<Integer> getSingle(int num,int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        //最中间的数必须是整数，不是整数则不行
        if(num % k != 0){
            return null;
        }else {
            //第一个数必须大于等于1，不然是错误的
            int mid = num / k;
            int reduce = k /2;
            if(mid - reduce <= 0){
                return null;
            }
            else {
                for (int i = 0; i < k; i++) {
                    arrayList.add(mid - reduce + i);
                }
                return arrayList;
            }
        }
    }
}
