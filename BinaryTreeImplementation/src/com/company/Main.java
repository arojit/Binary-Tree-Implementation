package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(17);
        binaryTree.add(15);
        binaryTree.add(20);
        binaryTree.add(12);
        binaryTree.add(16);
        binaryTree.add(18);
        binaryTree.add(25);
        binaryTree.add(9);
        binaryTree.add(10);

        binaryTree.recursiveInorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.recursivePreorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.recursivePostorderTraversal(binaryTree.root);
        System.out.println();
        binaryTree.iterativeInorderTraversal();
        System.out.println();
        binaryTree.iterativePreorderTraversal();
        System.out.println();
        binaryTree.iterativePostorderTraversal();
    }
}
