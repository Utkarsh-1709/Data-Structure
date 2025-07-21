package LinkedList.SinglyLinkedList.test;

import LinkedList.SinglyLinkedList.service.SinglyLinkedList;

/**
 * Tester class to demonstrate the functionality of the LinkedList class.
 * It creates a linked list, adds elements, and performs various operations.
 */

public class Tester {
    
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        // ll.display();
        ll.addLastUsingSingleNode(8);
        ll.addLastUsingSingleNode(9);
        ll.addLastUsingSingleNode(10);
        ll.addLastUsingSingleNode(11);
        // ll.display();

        ll.addAtIndex(23, 4);
        // ll.display();
        // System.out.println("Size of Linked List: "+ll.size);

        // ll.removeFirst();
        // ll.display();

        // ll.removeLast();
        // ll.display();
        // System.out.println("Size of Linked List: "+ll.size);
        //System.out.println(ll.searchIterative(5));
        // System.out.println(ll.searchIterative(24));

        // System.out.println(ll.searchRecursive(5));
        // System.out.println(ll.searchRecursive(24));

        // ll.reverseLinkedList();
        ll.display();
        // ll.deleteNthNodeFromEnd(4);
        // ll.display();
        ll.zigZag();
        ll.display();
    }

}
