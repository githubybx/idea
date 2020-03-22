package com.example.demo;

import java.util.ArrayList;

public class AddNum {
    public static void main(String[] args) {
    }
    public static ArrayList get(int[] array,int k) {
        if(array.length == 0){
            return new ArrayList<Integer>();
        }
        int flag = Integer.MAX_VALUE;
        int index = 0;
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            objects.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= k){
                break;
            }
            if(objects.contains(k-array[i])){
                int compare = array[i] * (k - array[i]);
                if(compare < flag){
                    index = i;
                    flag = compare;
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(objects.contains(k - array[index])){
            if(k  - array[index] > array[index]){
                arrayList.add(array[index]);
                arrayList.add(k - array[index]);
                return arrayList;
            }else {
                arrayList.add(k - array[index]);
                arrayList.add(array[index]);
                return arrayList;
            }
        }
        else {
            return arrayList;
        }
    }
}
