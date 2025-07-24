package BinaryTree.service;

/**
 * Node class representing a node in a binary tree.
 * It contains data, a reference to the left child, and a reference to the right child.
 * This class is used in various tree traversal algorithms.
 * It is a fundamental part of the binary tree structure.
 * It is used in the BuildTree, PostOrder, InOrder, and PreOrder classes.
 */

public class Node {
    
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
