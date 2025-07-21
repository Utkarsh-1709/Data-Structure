package LinkedList.DoublyLinkedList.test;

import LinkedList.DoublyLinkedList.service.DoublyLinkedList;

public class Tester {
    
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        dll.reverseDoublyLinkedList();
        dll.print();
        // System.out.println(dll.size);
    }

}
