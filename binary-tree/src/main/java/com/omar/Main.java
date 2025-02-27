package com.omar;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    boolean balanced = true;

    public static void main(String[] args) {

//        2 types of traversal of a binary tree

//        Deapth first Search (DFS)
//        Breadth first search (BFS)


//        3 types of DFS traversals:
//          1. PreOrder
//          2. InOrder
//          3. PostOrder



/*
           Preorder
            1. Node
            2. Left
            3. Right

           InOrder
             1. Left
             2. Node
             3. Right

           PostOrder
            1. Left
            2. Right
            3. Node

            O(n)




*/


        /* 4 5 2 10 3 1
                1
             2        3
         4      5         10
        * */


        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(10);

        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.right=F;


//        preOrder(A);
//        preOrderIterative(A);

//        inOrder(A);

//        postOrder(A);

//        levelOrder(A);

        System.out.println(maxDepth(A));


        System.out.println(search(A,2));
    }

    //   Recirsive PreOrder Traversal (DFS) Time O(n)
    public static void preOrder(TreeNode node){

//        Base Case
        if(node ==null){
            return;
        }


//        Recursive Case
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

//    Recursive inOrder traversal (DFS)
    public static void inOrder(TreeNode node){

//        base case
        if(node ==null){
            return;
        }

        inOrder(node.left);
        System.out.println(node);
        inOrder(node.right);

    }

//    Recursive Post Order Traversal
    public static void postOrder(TreeNode node){

        //        base case
        if(node ==null){
            return;
        }


//        recursive case
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node);
    }

//    Iterative preorder traversal
    public static void preOrderIterative(TreeNode node){

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);


        while(!stack.isEmpty()){
            node = stack.pop();
            System.out.println(node);

            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

//    BFS Level Order Traversal

    public static void levelOrder(TreeNode node){

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.println(node);

            if(node.left !=null) queue.add(node.left);
            if(node.right !=null) queue.add(node.right);

        }
    }

    public static boolean search(TreeNode node, int target){
        if(node == null){
            return false;
        }

        if(node.value == target) return true;

        return search(node.left,target) || search(node.right,target);
    }


    public TreeNode invertTree(TreeNode root) {

//        base case
        if(root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }


    public static int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }


        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return 1 + Math.max(left,right);
    }


    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced;
    }

    public int height(TreeNode root) {

        if(root == null){
            return 0;
        }


        int left = height(root.left);

        int right = height(root.right);

        if(Math.abs(left - right) > 1){
            balanced = false;
        }


        return 1 + Math.max(left,right);
    }


}