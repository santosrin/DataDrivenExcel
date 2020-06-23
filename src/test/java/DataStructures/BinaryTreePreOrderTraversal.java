package DataStructures;

public class BinaryTreePreOrderTraversal {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.data = data;
        }
    }
    public static TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node50;
        node20.left = node30;
        node20.right = node40;
        node50.left = node60;
        node50.right = node70;
        return rootNode;
    }

    //preorder - recursive solution
    public static void preOrderTraversal(TreeNode root) {
       if(root!= null) {
           System.out.print(root.data+ " ");
           preOrderTraversal(root.left);
           preOrderTraversal(root.right);
       }
    }

    public static void main(String[] args) {
        //BinaryTree bt = new BinaryTree();
        TreeNode node = createBinaryTree();
        preOrderTraversal(node);
    }
}
