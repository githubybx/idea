package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DeleteRepeat {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        deleteDuplication(listNode);
    }
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode start = pHead;
        ListNode mid = start.next;
        ListNode pre = pHead;
        ListNode start2 = start;
        ListNode tail = mid.next;
        while (tail != null){
            if(mid.val != pre.val && mid.val != tail.val){
                start2.next = mid;
                start2 = mid;
            }
            pre = mid;
            mid = tail;
            tail = tail.next;
        }
        if(start2.val != tail.val){
            start2.next = tail;
        }
        return start;
    }
}
