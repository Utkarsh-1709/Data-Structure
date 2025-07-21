package CircularLinkedList.SinglyCircularLinkedList.test;

import CircularLinkedList.SinglyCircularLinkedList.service.SinglyCircularLinkedList;

/*
 * This class tests the functionality of the SinglyCircularLinkedList class.
 * It creates a list, inserts several elements, displays the list,
 * deletes an element from the end, and then displays the list again.
 * Finally, it deletes an element from the beginning and displays the list again.
 */

public class SinglyCircularLinkedListTester {
	
	public static void main(String[] args) {
		
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.display();
		
		list.deleteAtEnd();
		list.display();
		
		list.deleteAtBeginning();
		list.display();
	}

}
