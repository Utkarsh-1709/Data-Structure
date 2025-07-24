package BinaryTree.service;

/**
 * PostOrder class for performing post-order traversal on a binary tree.
 * It prints the data of each node in post-order sequence: left, right, root.
 * This class is used in the PostOrder traversal algorithm.
 */

public class PostOrder {
    
    public void postOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
