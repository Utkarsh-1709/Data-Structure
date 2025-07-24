package BinaryTree.service;

/**
 * InOrder class for performing in-order traversal on a binary tree.
 * It prints the data of each node in in-order sequence: left, root, right.
 * This class is used in the InOrder traversal algorithm.
 */

public class InOrder {
    
    public void inOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
}
