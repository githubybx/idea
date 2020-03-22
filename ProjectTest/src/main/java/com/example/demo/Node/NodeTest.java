package com.example.demo.Node;

public class NodeTest {
    public static void main(String[] args) {
        Node normal = NodeUtil.normal();
        Node clone = Clone(normal);
        while (clone != null) {
            System.out.print(clone.lable + " ");
            clone = clone.next;
        }
    }

    public static Node Clone(Node pHead) {
        //在原链表的基础上复制节点
        if (pHead == null) {
            return null;
        }
        Node flag = pHead;
        while (flag != null) {
            Node node1 = new Node(flag.lable);
            Node next = flag.next;
            flag.next = node1;
            node1.next = next;
            flag = next;
        }
        //复制的随机节点
        Node flag1 = pHead;
        while (flag1.next.next != null) {
            Node next = flag1.next;
            next.random = flag1.random == null ? null : flag1.random.next;
            flag1 = next.next;
        }
        Node head = pHead.next;
        //分离两个链表
        Node tail = pHead.next;
        Node start = pHead;
        while (start.next.next != null) {
            Node start1 = start.next.next;
            Node next = start.next;
            Node next1 = start1.next;
            next.next = next1;
            start.next = start1;
            start = start1;

        }
        return head;
    }
}
