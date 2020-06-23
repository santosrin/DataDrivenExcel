package DataStructures;

public class BinaryTreePostOrderTraversal {

    public static class BinaryTree {
        int data;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int data) {
            this.data = data;
        }
    }

    public static BinaryTree createBinaryTree() {
        BinaryTree rootNode = new BinaryTree(10);
        BinaryTree Node20 = new BinaryTree(20);
        BinaryTree Node30 = new BinaryTree(30);
        BinaryTree Node40 = new BinaryTree(40);
        BinaryTree Node50 = new BinaryTree(50);
        BinaryTree Node60 = new BinaryTree(60);
        BinaryTree Node70 = new BinaryTree(70);

        rootNode.left = Node20;
        rootNode.right = Node50;

        Node20.left = Node30;
        Node20.right = Node40;

        Node50.left = Node60;
        Node50.right = Node70;

        return rootNode;
    }

    public static void postOrderTraversal(BinaryTree root) {
        if(root!= null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree node = createBinaryTree();
        postOrderTraversal(node);
    }
}
