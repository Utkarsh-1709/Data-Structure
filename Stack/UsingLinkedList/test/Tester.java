package Stack.UsingLinkedList.test;

import Stack.UsingLinkedList.service.StackUsingLinkedList;

/*
 * This class is a tester for the StackUsingLinkedList class.
 * It demonstrates the functionality of the stack by pushing elements onto it,
 * and then popping and printing them until the stack is empty.
 * The Tester class is essential for verifying that the StackUsingLinkedList class works as expected.
 */

public class Tester {

    public static void main(String[] args) {

        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();

        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);

        while (!stackUsingLinkedList.isEmpty()) {
            System.out.println(stackUsingLinkedList.peek());
            stackUsingLinkedList.pop();
        }
    }
}
