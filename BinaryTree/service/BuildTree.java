package BinaryTree.service;

/**
 * BuildTree class for constructing a binary tree from an array representation.
 * It uses a recursive approach to build the tree, where -1 indicates a null node.
 * This class is used to create the binary tree structure for traversal algorithms.
 */

public class BuildTree {

    static int idx = -1;
    
    public Node buildTree(int nodes[]) 
    {
        idx++;
        if(idx>nodes.length-1 || nodes[idx]==-1)
        {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}
