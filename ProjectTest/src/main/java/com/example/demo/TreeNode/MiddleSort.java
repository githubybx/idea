package com.example.demo.TreeNode;

import sun.reflect.generics.tree.Tree;

public class MiddleSort {
    public static void main(String[] args) {
        TreeNode normal = normal();
        midSort(normal);
    }

    public static TreeNode normal() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(treeNode5);
        treeNode3.setLeft(treeNode6);
        return treeNode1;
    }

    public static void midSort(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.getLeft() != null) {
            midSort(treeNode.getLeft());
        }
        System.out.print(treeNode.val + " ");
        if (treeNode.getRight() != null) {
            midSort(treeNode.getRight());
        }
    }
}
