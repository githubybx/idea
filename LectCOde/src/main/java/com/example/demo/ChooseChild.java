package com.example.demo;

import java.util.ArrayList;

public class ChooseChild {
    public static void main(String[] args) {
        System.out.println(choose(5, 3));
    }
    public static int choose(int n, int m){
        if(n == 0){
            return -1;
        }
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            objects.add(i);
        }
        int i = 0;
        int start = 0;
        int remove = 0;
        while (objects.size() > 1){
            //第一次定位remove需要减1，后面已经定位好了，就不需要减少1了
            if(i == 0) {
                remove = (start + m) % (n - i) - 1;
            }else {
                remove = (start + m) % (n - i);
            }
            if(remove < 0){
                remove = objects.size() - 1;
            }
            System.out.println("删除的数" + objects.get(remove));
            objects.remove(remove);
            start = remove - 1;
            if(start < 0){
                start = objects.size() - 1;
            }
            i ++;
        }
        return objects.get(0);
    }
}
