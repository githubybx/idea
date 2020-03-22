package com.example.demo.Code;

public class Tree {
    public Node NormalTree() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(5);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        return node1;
    }
}
