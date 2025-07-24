package BinaryTree.test;

import java.util.Scanner;

import BinaryTree.service.BuildTree;
import BinaryTree.service.InOrder;
import BinaryTree.service.LevelOrder;
import BinaryTree.service.Node;
import BinaryTree.service.PostOrder;
import BinaryTree.service.PreOrder;


public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter the no. of Nodes you want to add: ");
        size = sc.nextInt();

        System.out.println("Enter the "+size+" nodes in Tree");
        int nodes[] = new int[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = sc.nextInt();
        }

        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);

        boolean exit = false;

        while (!exit) {
            System.out.println("--------:Select from the below Traversal Options:--------");
            System.out.println("1. Pre-Order Traversal");
            System.out.println("2. In-Order Traversal");
            System.out.println("3. Post-Order Traversal");
            System.out.println("4. Level Order Traversal");
            System.out.println("0. Exit");
            switch (sc.nextInt()) 
            {
                case 1:
                    PreOrder preOrder = new PreOrder();
                    preOrder.preorderTraversal(root);
                    System.out.println();
                    break;

                case 2:
                    InOrder inOrder = new InOrder();
                    inOrder.inOrderTraversal(root);
                    System.out.println();
                    break;
                
                case 3:
                    PostOrder postOrder = new PostOrder();
                    postOrder.postOrderTraversal(root);
                    System.out.println();
                    break;

                case 4:
                    LevelOrder levelOrder = new LevelOrder();
                    levelOrder.levelOrderTraversal(root);
                    break;

                case 0:
                    exit = true;
                    break;
            
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        
        sc.close();
    }
}
