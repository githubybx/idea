package com.example.demo;

public class TrreeNode {
    public static void main(String[] args) {
        Node tree = Node.getTree();
        System.out.println(judke(tree));
    }
    public static int getTreeDeepth(Node node){
        if(node == null){
            return 0;
        }else {
            return Math.max(getTreeDeepth(node.left)+1,getTreeDeepth(node.right)+1);
        }
    }
    public static boolean judke(Node node){
        if(node == null){
            return true;
        }else {
            int left = 0;
            int right = 0;
            if(node.left != null){
                left = getTreeDeepth(node.left);
            }else {
                left = 0;
            }
            if(node.right != null){
                right = getTreeDeepth(node.right);
            }else {
                right = 0;
            }
            if(Math.abs(left - right) <= 1){
                return judke(node.left )&&judke(node.right);
            }else {
                return false;
            }
        }
    }
}
