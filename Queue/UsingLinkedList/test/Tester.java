package Queue.UsingLinkedList.test;

import Queue.UsingLinkedList.service.QueueUsingLinkedList;

/*
 * Tester class to demonstrate the functionality of QueueUsingLinkedList
 * This class creates a queue, inserts elements into it, and then removes them while printing the front element.
 * It showcases the basic operations of a queue implemented using a linked list.
 */

public class Tester {

    public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		
		while(!queue.isEmpty())
		{
			System.out.print(queue.peek()+" ");
			queue.delete();
		}
        System.out.println();
	}
}

