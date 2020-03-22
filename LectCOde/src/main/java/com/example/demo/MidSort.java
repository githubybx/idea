package com.example.demo;

import java.util.ArrayList;

public class MidSort {
    static ArrayList list = new ArrayList<Integer>();
    public static void main(String[] args) {

        Node tree = Node.getTree();
        System.out.println(ahha(tree));
    }
    public static void mid(Node node){
        if(node == null){
            return;
        }
        if(node.getLeft() != null){
            mid(node.getLeft());
        }
        list.add(node.val);
        if(node.getRight() != null){
            mid(node.getRight());
        }
    }
    public static boolean judje(ArrayList<Integer> list){
        if(list == null){
            return false;
        }
        else {
            for (int i = 0; i < list.size() - 1; i++) {
                if(list.get(i) > list.get(i + 1)){
                    return false;
                }
            }
        }
        return true;
    }
    public static int min(Node node){
        if(node == null){
            return 0;
        }else {
            return Math.min(min(node.getLeft()) + 1,min(node.getRight())+1);
        }
    }
    public static int max(Node node){
        if(node == null){
            return 0;
        }else {
            return Math.max(max(node.getLeft()) + 1,max(node.getRight())+1);
        }
    }
    public static boolean ahha(Node tree){
        mid(tree);
        boolean judje = judje(list);
        int i = max(tree) - min(tree);
        System.out.println(judje + " " + i);
        if(i <= 1 && judje){
            return true;
        }else {
            return false;
        }
    }
}
