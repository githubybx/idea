package com.example.demo;

public class Mult {
    public static void main(String[] args) {
        multiply(new int[]{1,2,3,4,5});
    }
    public static int[] multiply(int[] A) {
        if(A == null){
            return new int[0];
        }
        if(A.length == 1){
            return new int[1];
        }
        else {
            int[] row = caluA(A);
            int[] cow = caluB(A);
            int[] ints = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                ints[i] = row[i] * cow[i];
            }
            return ints;
        }
    }
    public static int[] caluA(int[] A){
        int[] row = new int[A.length];
        row[0] = 1;
        for (int i = 1; i < A.length; i++) {
            row[i] = row[i - 1] * A[i-1];
        }
        return row;
    }
    public static int[] caluB(int[] A){
        int[] cow = new int[A.length];
        cow[A.length - 1] = 1;
        for (int i = A.length - 2; i >= 0 ; i--) {
            cow[i] = cow[i + 1] * A[i+1];
        }
        return cow;
    }
}

