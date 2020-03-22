package com.example.demo;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 15, 7, 8};
        System.out.println(Arrays.binarySearch(ints, 15));
        //System.out.println(binarySearch(ints, 9, 0, ints.length - 1));
    }

    public static int binarySearch(int[] array, int k, int start, int end) {
        if (start <= end) {
            //判断边界问题
            if (start == end) {
                if (array[start] == k) {
                    return start;
                } else {
                    return -1;
                }
            }
            //未到边界
            int mid = array[(end + start) / 2];
            if (mid == k) {
                return (end + start) / 2;
            } else {
                if (mid < k) {
                    return binarySearch(array, k, (end + start) / 2 + 1, end);
                } else {
                    return binarySearch(array, k, 0, (end + start) / 2 - 1);
                }
            }
        } else {
            return -1;
        }
    }
}
