package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class PukePai {
    public static void main(String[] args) {
        System.out.println(judje(new int[]{1, 3, 0, 5, 0}));
    }
    public static int[] getPai(){
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            objects.add(i);
            objects.add(i);
            objects.add(i);
            objects.add(i);
        }
        objects.add(0);
        objects.add(0);
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            Integer remove = objects.remove((int)(Math.random() * (54 - i)));
            ints[i] = remove;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        return ints;
    }
    public static boolean judje(int[] array){
        if(array == null || array.length< 5){
            return false;
        }
        Arrays.sort(array);
        int start = 0;
        if(array[start] == 0){
            start ++;
        }
        for(int i = start;i < array.length - 1; i++){
            while (array[i + 1] == array[i]){
                return false;
            }
        }
        if(array[4] - array[start] <= 4){
            return true;
        }else {
            return false;
        }
    }
}
