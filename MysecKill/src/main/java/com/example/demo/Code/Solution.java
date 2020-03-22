package com.example.demo.Code;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {5, 4, 3, 2, 1};
        System.out.println(VerifySquenceOfBST(ints));
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        } else if (sequence.length == 1) {
            return true;
        } else {
            return isLastOrder(sequence, 0, sequence.length - 1);
        }
    }

    public static boolean isLastOrder(int[] sequence, int start, int end) {
        if (end - start + 1 == sequence.length) {
            int count = 0;
            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] > sequence[i + 1]) {
                    count++;
                }
            }
            if (count == sequence.length - 1) {
                return true;
            }
        }
        if (start == end) {
            return true;
        }
        if (end - start == 1) {
            if (sequence[end] > sequence[start]) {
                return true;
            } else {
                return false;
            }
        }
        int compare = sequence[end];
        int i = start;
        while (i <= end && sequence[i] < sequence[end]) {
            i++;
        }
        i--;
        int j = end;
        while (j >= start && sequence[j] >= sequence[end]) {
            j--;
        }
        j++;
        if (i >= j) {
            return false;
        }
        if (i + 1 != j) {
            return false;
        }
        if (j == end && i == end - 1) {
            return isLastOrder(sequence, start, end - 1);
        }
        return isLastOrder(sequence, start, i) && isLastOrder(sequence, j, end - 1);
    }
}
