package Stack.UsingLinkedList.service;

/*
 * This class represents an implementation of a stack using a linked list.
 * It provides methods to check if the stack is empty, push an element onto the stack,
 * pop an element from the stack, and peek at the top element of the stack.
 * The stack is implemented using a linked list where each node contains a data and a reference to the next node.
 * The StackUsingLinkedList class is essential for managing a stack data structure and provides a dynamic way to 
 * handle elements without a fixed size.
 */

public class StackUsingLinkedList {
    
    Node head = null;

    public boolean isEmpty()
    {
        return head==null;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);

        if(isEmpty())
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }

        int top = head.data;
        head = head.next;

        return top;
    }

    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }

        return head.data;
    }

}
