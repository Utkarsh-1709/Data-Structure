package BinaryTree.service;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LevelOrder.java
 * This class provides a method to perform level order traversal on a binary tree.
 * Level order traversal visits all the nodes at the present depth level before moving on to the nodes at the next depth level.
 * It uses a queue to keep track of nodes at each level.
 * The traversal is printed in a breadth-first manner, where each level of the tree is printed on a new line.
 */

public class LevelOrder {
    
    public void levelOrderTraversal(Node root)
    {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if(currentNode==null)
            {
                System.out.println();
                if(queue.isEmpty())
                {
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }
            }
        }
    }
}
