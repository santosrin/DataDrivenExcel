package com.repractice;

public class BinaryTreePostOrderTraversal {

    public static class BinaryTree {
        int data;
        BinaryTree left;
        BinaryTree right;
        public BinaryTree(int data) {
            this.data = data;
        }
    }

    public static BinaryTree createBinaryTree() {
        BinaryTree rootNode = new BinaryTree(10);
        BinaryTree node20 = new BinaryTree(20);
        BinaryTree node30 = new BinaryTree(30);
        BinaryTree node40 = new BinaryTree(40);
        BinaryTree node50 = new BinaryTree(50);
        BinaryTree node60 = new BinaryTree(60);
        BinaryTree node70 = new BinaryTree(70);

        rootNode.left = node20;
        rootNode.right = node50;

        node20.left = node30;
        node20.right = node40;

        node50.left = node60;
        node50.right = node70;

        return rootNode;
    }

    public static void postOrderTraversal(BinaryTree root) {
        if(root!=null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data + " ");
        }
    }

    public static void preOrderTraversal(BinaryTree root) {
        if(root!=null) {
            System.out.println(root.data + " ");
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree node = createBinaryTree();
        //postOrderTraversal(node);
        preOrderTraversal(node);
    }
}
