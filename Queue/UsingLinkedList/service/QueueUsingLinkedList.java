package Queue.UsingLinkedList.service;

/**
 * QueueUsingLinkedList class implements a Simple Queue using a Linked List.
 * It provides methods to add, remove, and peek elements in the queue.
 */

public class QueueUsingLinkedList {
    private Node front;
	private Node rear;
	
	public boolean isEmpty()
	{
		return front==null;
	}
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(isEmpty())
		{
			front = rear = newNode;
		}
		
		else {
			rear.next = newNode;
			rear = newNode;
		}

	}
	
	public int delete()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int data = front.data;
		
		front = front.next;
		
		return data;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		
		return front.data;
	}
}
