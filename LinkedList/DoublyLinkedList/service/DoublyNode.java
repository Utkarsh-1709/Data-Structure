package LinkedList.DoublyLinkedList.service;

/*
 * This class represents a node in a doubly linked list.
 * Each node contains data and pointers to the next and previous nodes.
 */

public class DoublyNode {
    
    int data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(int data) {
        super();
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
