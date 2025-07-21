package Stack.UsingLinkedList.service;

/*
 * This class represents a node in a linked list.
 * It contains an integer data and a reference to the next node.
 * It is used to implement a stack using a linked list.
 * The Node class is essential for the StackUsingLinkedList class to function correctly.
 * It provides the structure for each element in the stack.
 * The Node class is used internally by the StackUsingLinkedList class to manage the stack's elements.
 */
public class Node {
    
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
