package LinkedList.DoublyLinkedList.service;

/*
 * This class represents a doubly linked list.
 * It provides methods to add, print, remove the first element,
 * and reverse the linked list.
 */

public class DoublyLinkedList {
    
    private DoublyNode head;
    public static int size;

    /*
     * Adds a new node with the specified data at the beginning of the list.
     */

    public void addFirst(int data){
        DoublyNode newNode = new DoublyNode(data);
        size++;
        if(head==null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    /*
     * Prints the elements of the doubly linked list.
     * If the list is empty, it prints a message indicating that.
     */

    public void print(){
        DoublyNode temp = head;
        if(temp==null)
        {
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+"<---->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*
     * Removes the first node from the list and returns its data.
     * If the list is empty, it returns Integer.MIN_VALUE.
     * If only one node is present, it clears the node and returns its data.
     */

    public int removeFirst()
    {
        int val = 0;
        if(head == null)
        {
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            val = head.data;
            head.next = null;
            head.prev = null;
            size--;
            return val;
        }

        val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    /*
     * Reverses the doubly linked list.
     * If the list is empty, it prints a message indicating that.
     */
    
    public void reverseDoublyLinkedList()
    {
        DoublyNode current = head;
        DoublyNode prev = null;
        DoublyNode next;

        if(head==null)
        {
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        head = prev;
    }


}
