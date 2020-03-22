package com.example.demo.Code;


import java.util.ArrayList;

public class TreePath {
    static ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        ArrayList<Integer> objects1 = new ArrayList<Integer>(objects);
        for (int a : objects1) {
            System.out.print(a + " ");
        }
        ArrayList<ArrayList<Integer>> arrayLists = FindPath(new Tree().NormalTree(), 7);
        for (ArrayList<Integer> arrayList : listAll) {
            for (int I : arrayList) {
                System.out.print(I + " ");
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> FindPath(Node root, int target) {
        if (root == null)
            return listAll;
        list.add(root.getValue());
        target -= root.getValue();
        if (target == 0 && root.getLeft() == null && root.getRight() == null) {
            listAll.add(new ArrayList<>(list));
        }
        FindPath(root.getLeft(), target);
        FindPath(root.getRight(), target);
        list.remove(list.size() - 1);
        return listAll;
    }

}

