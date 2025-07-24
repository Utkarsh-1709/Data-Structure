package BinaryTree.service;

/**
 * PreOrder class for performing pre-order traversal on a binary tree.
 * It prints the data of each node in pre-order sequence: root, left, right.
 * This class is used in the PreOrder traversal algorithm.
 */

public class PreOrder {
    
    public void preorderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
