package com.example.demo.Node;

public class NodeUtil {
    public static Node normal() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node1.random = node3;
        node2.next = node3;
        node2.random = node1;
        node3.next = node4;
        node4.random = node1;
        node3.random = node2;
        return node1;
    }
}
