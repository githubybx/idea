package com.example.demo;


import java.util.ArrayList;

public class Trash {
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        char[] chars = "123".toCharArray();
        sort(chars, 0, list);
        for (String str : list) {
            System.out.print(str + " ");
        }
    }

    public static void sort(char[] array, int start, ArrayList list) {
        if (start == array.length - 1) {
            return;
        }
        char[] clone = array.clone();
        for (int j = start; j <= array.length - 1; j++) {

            Swap(clone, start, j);
            if (!list.contains(new String(clone)))
                list.add(new String(clone));
            sort(clone, start + 1, list);
        }

    }

    public static void Swap(char[] array, int i, int j) {
        char mid = ' ';
        mid = array[i];
        array[i] = array[j];
        array[j] = mid;
    }
}
