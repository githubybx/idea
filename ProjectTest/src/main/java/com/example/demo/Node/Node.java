package com.example.demo.Node;

public class Node {
    int lable;
    Node next;
    Node random;

    public Node(int lable, Node next, Node random) {
        this.lable = lable;
        this.next = next;
        this.random = random;
    }

    public Node(int lable) {
        this.lable = lable;
    }

    public int getLable() {
        return lable;
    }

    public void setLable(int lable) {
        this.lable = lable;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getRandom() {
        return random;
    }

    public void setRandom(Node random) {
        this.random = random;
    }
}
