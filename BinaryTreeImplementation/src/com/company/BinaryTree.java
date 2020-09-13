package com.company;

import java.util.Stack;

public class BinaryTree {
    Node root;

    public void add(int data){
        Node node = new Node(data);

        if(root == null){
            root = node;
        }
        else{
            Node focusNode = root;

            Node parent;

            while(true){
                parent = focusNode;
                if(data < focusNode.data){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = node;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.right;
                    if(focusNode == null){
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }
    public void display(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            Node tmp = stack.peek();
            if(tmp.left != null){
                stack.push(tmp.left);
            }
            else{
                System.out.println(tmp.data);
                stack.pop();
                if(tmp.right != null){
                    stack.push(tmp.right);
                }
            }
        }
    }
    public void recursiveInorderTraversal(Node focusNode){
        if(focusNode != null) {
            recursiveInorderTraversal(focusNode.left);
            System.out.print(focusNode.data + " ");
            recursiveInorderTraversal(focusNode.right);
        }
    }

    public void recursivePreorderTraversal(Node focusNode){
        if(focusNode != null) {
            System.out.print(focusNode.data + " ");
            recursivePreorderTraversal(focusNode.left);
            recursivePreorderTraversal(focusNode.right);
        }
    }

    public void recursivePostorderTraversal(Node focusNode){
        if(focusNode != null) {
            recursivePostorderTraversal(focusNode.left);
            recursivePostorderTraversal(focusNode.right);
            System.out.print(focusNode.data + " ");
        }
    }

    public void iterativeInorderTraversal(){
        Node focusNode = root;
        if(focusNode == null)
            return;
        Stack<Node> stack = new Stack<>();

        while (focusNode != null || stack.size() > 0){
            while (focusNode != null){
                stack.push(focusNode);
                focusNode = focusNode.left;
            }

            focusNode = stack.pop();
            System.out.print(focusNode.data + " ");

            focusNode = focusNode.right;
        }
    }

    public void iterativePreorderTraversal(){
        Node focusNode = root;
        if(focusNode == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(focusNode);

        while (stack.empty() == false){
            Node node = stack.peek();
            System.out.print(node.data + " ");
            stack.pop();

            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

    public void iterativePostorderTraversal(){
        Node focusNode = root;
        if(focusNode == null)
            return;
        Stack<Node> stack1 = new Stack<>();
        stack1.push(focusNode);
        Stack<Node> stack2 = new Stack<>();

        while (stack1.empty() == false){
            Node node = stack1.peek();
            stack2.push(node);
            stack1.pop();

            if(node.left != null){
                stack1.push(node.left);
            }
            if(node.right != null){
                stack1.push(node.right);
            }
        }

        while (stack2.empty() == false){
            Node node = stack2.peek();
            System.out.print(node.data + " ");
            stack2.pop();
        }
    }


    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
}
