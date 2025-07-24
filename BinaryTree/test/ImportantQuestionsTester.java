package BinaryTree.test;

import java.util.Scanner;

import BinaryTree.service.BuildTree;
import BinaryTree.service.ImportantQuestions;
import BinaryTree.service.Node;

public class ImportantQuestionsTester {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of a Binary Tree");
        int size = sc.nextInt();

        System.out.println("Enter the "+size+" nodes in a Binary Tree");
        int nodes[] = new int[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = sc.nextInt();
        }

        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);

        boolean exit = false;

        ImportantQuestions questions = new ImportantQuestions();

        while (!exit) {
            System.out.println("-----------:Select from the below Option:-----------");
            System.out.println("1. Count the No. of Nodes in a Binary tree");
            System.out.println("2. Sum of Nodes in a Binary tree");
            System.out.println("3. Height of a Binary tree");
            System.out.println("0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    int countofNodes = questions.countNoOfNodes(root);
                    System.out.println("No. of Nodes are: "+countofNodes);
                    break;
                
                case 2:
                    int sumOfNodes = questions.sumOfNodes(root);
                    System.out.println("Sum of Nodes are: "+sumOfNodes);
                    break;

                case 3:
                    System.out.println("Height of a Binary Tree is: "+questions.height(root));
                    break;

                case 0:
                    exit = true;
                    break;
            
                default:
                    System.out.println("Invalid Option Selected!!!!");
                    break;
            }
        }

        sc.close();
    }
}
