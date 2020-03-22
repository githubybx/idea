package com.example.demo;

import java.util.ArrayList;

public class TopK {
    public static void main(String[] args) {
        int[] ints = {3, 2, 1, 5, 3, 5, 5, 2, 1, 0, -2, -2, -2};
        sort(ints, 4);
        for (int i : ints) {
            System.out.print(i + " ");
        }
        for (int j = 4; j < ints.length; j++) {
            insert(ints, 3, j);
        }
        System.out.println("--------");
        for (int i = 0; i <= 3; i++) {
            System.out.print(ints[i] + " ");
            ;
        }
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> objects = new ArrayList<Integer>();
        sort(input, k);
        if (k + 1 < input.length) {
            for (int j = k; j < input.length; j++) {
                insert(input, k - 1, j);
            }
        }
        for (int i = 0; i < k; i++) {
            objects.add(input[i]);
        }
        return objects;
    }

    public static void sort(int[] arrray, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrray[j + 1] < arrray[i]) {
                    int mid = 0;
                    mid = arrray[j + 1];
                    arrray[j + 1] = arrray[j];
                    arrray[j] = mid;
                }
            }
        }
    }

    public static void insert(int[] array, int end, int index) {
        if (array[index] > array[end]) {
            return;
        }
        int flag = end;
        while (array[index] < array[flag] && flag > 0) {
            flag--;
        }
        int mid = array[index];
        for (int j = end; j >= flag; j--) {
            array[j + 1] = array[j];
        }
        array[flag] = mid;
    }
}
