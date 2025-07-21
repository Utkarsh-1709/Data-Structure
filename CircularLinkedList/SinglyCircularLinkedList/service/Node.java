package CircularLinkedList.SinglyCircularLinkedList.service;

/*
 * This class represents a node in a singly circular linked list.
 * Each node contains data and a reference to the next node in the list.
 */

public class Node {
    
    int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}

}
