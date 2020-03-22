package com.example.demo;


import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;
import java.util.Comparator;

public class Max {
    public static void main(String[] args) {
        int[] ints = {12, 32, 123};
        String[] string = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            string[i] = ints[i] + "";
        }
        System.out.println(Sort(string));
    }

    public static int Sort(String[] array) {
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : array) {
            stringBuilder.append(str);
        }
        return Integer.parseInt(new String(stringBuilder));

    }
}
