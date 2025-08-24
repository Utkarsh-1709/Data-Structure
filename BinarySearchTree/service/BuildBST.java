package BinarySearchTree.service;

/*
 * Build Binary Search Tree(BST) Program
 * A BST is a binary tree in which:
    * The left subtree of a node contains only nodes with values less than the node’s value.
    * The right subtree of a node contains only nodes with values greater than the node’s value.
    * Both the left and right subtrees must themselves also be binary search trees.
 */
public class BuildBST {
    
    public Node buildBST(Node root, int val)
    {
        if(root==null)
        {
            return new Node(val);
        }

        if(root.data>val)
        {
            root.left = buildBST(root.left, val);
        }

        else{
            root.right = buildBST(root.right, val);
        }

        return root;
    }

    public void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
