package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 2, 4, 2, 4};
        System.out.println(count(ints));
    }

    public static int count(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
                System.out.println(array[i] + " " + (map.get(array[i])));
            } else {
                map.put(array[i], 1);
                System.out.println(array[i] + " " + 1);
            }
        }
        int max = 0;
        int key = 0;
        Set<Integer> integers = map.keySet();
        for (Integer i : integers) {
            if (map.get(i) >= max) {
                max = map.get(i);
                key = i;
                System.out.println(max + "----" + key);
            }
        }
        if (max > array.length / 2) {
            System.out.println(key);
            return key;
        } else {
            return 0;
        }
    }
}
