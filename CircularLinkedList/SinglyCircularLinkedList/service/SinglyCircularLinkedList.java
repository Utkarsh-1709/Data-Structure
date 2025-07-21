package CircularLinkedList.SinglyCircularLinkedList.service;

/*
 * This class implements a singly circular linked list with methods to insert, display, and delete nodes.
 * It allows insertion at the end, deletion at the beginning, and deletion at the end of the list.
 * The list is circular, meaning the last node points back to the head.
 * The display method prints the elements in the list.
 */

public class SinglyCircularLinkedList {
    
    Node head = null;
	Node tail = null;
	
    /*
     * Method to insert a new node with the given data at the end of the list.
     * If the list is empty, it initializes both head and tail to the new node.
     * If the list is not empty, it adds the new node at the end and updates
     */

	public void insert(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head = tail = newNode;
			tail.next = head;
		}else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
    /*
     * Method to display the elements of the list.
     * It traverses the list starting from head and prints each node's data.
     * If the list is empty, it prints a message indicating that the list is empty.
     */

	public void display()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node temp = head;
		
		do {
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}while(temp!=head);
		
		System.out.println();
	}
	
    /*
     * Method to delete a node at the beginning of the list.
     * If the list is empty, it prints a message and returns -1.
     * If the list has only one node, it sets both head and tail to null.
     * Otherwise, it updates head to the next node and adjusts tail's next pointer.
     * Returns the data of the deleted node.
     */

	public int deleteAtBeginning()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return -1;
		}
		
		int data = head.data;
		
		if(head==tail)
		{
			head = tail = null;
		}else {
			head = head.next;
			tail.next = head;
		}
		
		return data;
	}
	
    /*
     * Method to delete a node at the end of the list.
     * If the list is empty, it prints a message and returns -1.
     * If the list has only one node, it sets both head and tail to null.
     * Otherwise, it traverses to the second last node, updates its next pointer,
     * and adjusts tail to point to this second last node.
     * Returns the data of the deleted node.
     */
    
	public int deleteAtEnd() {
		
		if(head==null)
		{
			System.out.println("List is Empty");
			return -1;
		}
		
		
		if(head==tail)
		{
			head = tail = null;
		}
		
		int data = head.data;
		
		Node temp = head;
		
		while(temp.next!=tail)
		{
			temp = temp.next;
		}
		
		temp.next = head;
		tail = temp;
		
		return data;
	}

}
