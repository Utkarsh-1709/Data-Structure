package LinkedList.SinglyLinkedList.service;

/*
 * This class represents a node in a singly linked list.
 * Each node contains data and a pointer to the next node.
 */

public class Node {
    
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
