package BinarySearchTree.test;

import java.util.Scanner;

import BinarySearchTree.service.BuildBST;
import BinarySearchTree.service.Node;

/*
 * Tester class to test the BuildBST class
 * Input: number of nodes and the nodes to build a BST
 * Output: Inorder Traversal of the built BST
 * Example:
 * Input: 5
 *        10 5 1 7 40 50
 * Output: 1 5 7 10 40 50 (Inorder Traversal)
 * Explanation: Inorder traversal of a BST gives nodes in sorted order
 */
public class Tester {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of nodes: ");
        int size = sc.nextInt();

        int nodes[] = new int[size];
        System.out.println("Enter "+size+" nodes to Build a BST");

        for(int i = 0;i<size;i++)
        {
            nodes[i] = sc.nextInt();
        }

        Node root = null;
        BuildBST bst = new BuildBST();

        for(int i = 0;i<size;i++)
        {
            root = bst.buildBST(root,nodes[i]);   
        }

        System.out.print("Built Binary Search Tree: ");
        bst.inOrder(root);
        System.out.println();
        sc.close();
    }
}
