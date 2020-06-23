package DataStructures;

public class BinaryTreeInOrderTraversal {

    public static class BinaryTree{
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

    public void inOrderTraversal(BinaryTree root) {
        if(root != null) {
           inOrderTraversal(root.left);
           System.out.print(root.data + " ");
           inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeInOrderTraversal bt = new BinaryTreeInOrderTraversal();
        BinaryTree node = createBinaryTree();
        bt.inOrderTraversal(node);
    }
}
