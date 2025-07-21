package Queue.UsingLinkedList.service;

/**
 * Node class represents a single node in the linked list used for the queue.
 * It contains data and a reference to the next node.
 */

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
