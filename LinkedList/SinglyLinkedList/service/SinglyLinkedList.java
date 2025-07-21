package LinkedList.SinglyLinkedList.service;

/**
 * SinglyLinkedList class provides methods to manipulate a singly linked list.
 * It allows adding elements at the beginning, end, and at specific indices,
 * as well as removing elements, searching for elements, reversing the list,
 * and deleting nodes from the end.
 */

public class SinglyLinkedList {
    
    private Node head;
    private Node tail;
    public static int size;

    /**
     * Adds a new node with the specified data at the beginning of the list.
     * @param data The data to be added to the new node.
     */

    public void addFirst(int data){
        //Step 1 -> Create a new Node
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newNode;
            return;
        }

        //Step 2 -> New Node next = Head
        newNode.next = head;    //Linking

        //Step 3 -> Make New Node as Head
        head = newNode;
    }

    /**
     * Adds a new node with the specified data at the end of the list.
     * @param data The data to be added to the new node.
     */

    public void addLast(int data){
        //Step 1 -> Create a New Node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //Step 2
        tail.next = newNode;

        //Step 3
        tail = newNode;
    }

    /**
     * Adds a new node with the specified data at the end of the list using a single node traversal.
     * @param data The data to be added to the new node.
     */

    public void addLastUsingSingleNode(int data){
        //Step 1
        Node newNode = new Node(data);
        size++;

        if(head==null)
        {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next!=null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    /**
     * Displays the elements of the linked list.
     */

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"--------->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /**
     * Adds a new node with the specified data at a specific index in the list.
     * @param data The data to be added to the new node.
     * @param idx The index at which the new node should be added.
     */

    public void addAtIndex(int data, int idx){
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * Removes the first node from the list and returns its data.
     * @return The data of the removed node.
     */

    public int removeFirst(){
        int value = head.data;
        head = head.next;
        return value;
    }

    /**
     * Removes the last node from the list and returns its data.
     * @return The data of the removed node, or -1 if the list is empty.
     */

    public int removeLast(){
        if(size==0)
            return -1;
        else if(size==1){
            int value = head.data;
            head = null;
            size = 0;
            return value;
        }
        Node temp = head;
        int i =0;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int value = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    /**
     * Searches for a node with the specified key using an iterative approach.
     * @param key The data to search for in the list.
     * @return The index of the node containing the key, or -1 if not found.
     */

    public int searchIterative(int key){
       
        Node temp  = head;
        for(int i = 0;i<size-1;i++)
        {
            if(temp.data==key)
                return i+1;
            temp = temp.next;
        }
        return -1;
    }

    /**
     * Searches for a node with the specified key using a recursive approach.
     * @param key The data to search for in the list.
     * @return The index of the node containing the key, or -1 if not found.
     */

    public int searchRecursive(int key){
        return helper(head, key);
    }

    /**
     * Helper method for recursive search.
     * @param head The current node in the recursion.
     * @param key The data to search for in the list.
     * @return The index of the node containing the key, or -1 if not found.
     */

    public int helper(Node head, int key){
        if(head==null)
            return -1;
        if(head.data==key)
            return 0;
        int index = helper(head.next,key);
        if(index==-1)
            return -1;
        return index+1;
    }

    /*
     * This method reverses the linked list in place.
     * It iterates through the list, reversing the direction of the next pointers.
     * After the reversal, the head of the list is updated to the last node processed.
     * Example: If the list is 1 -> 2 -> 3, after reversal it will be 3 -> 2 -> 1.
     */

    public void reverseLinkedList(){
        Node previous = null;
        Node current = head;
        Node next;

        while (current!=null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;            
        }
        head = previous;
    }

    /**
     * Deletes the nth node from the end of the list.
     * @param nth The position from the end of the list to delete.
     */

    public void deleteNthNodeFromEnd(int nth){
        int s = 0;
        Node temp = head;
        
        while(temp!=null){
            temp = temp.next;
            s++;
        }

        if(nth==s){
            head = head.next;
            return;
        }

        Node current = head;

        for(int i = 1;i<s-nth;i++){
            current = current.next;
        }
        current.next = current.next.next;
    }

    /*
     * Rearranges the linked list in a zigzag pattern.
     * The first half of the list is reversed and then merged with the second half.
     * Example: If the list is 1 -> 2 -> 3 -> 4 -> 5, it will be rearranged to 1 -> 5 -> 2 -> 4 -> 3.
     * This method first finds the middle of the list, reverses the second half,
     * and then merges the two halves in a zigzag manner.
     */

    public void zigZag(){

        if(head==null || head.next==null) return;

        //Find the Middle Node
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Make the mid point to null
        Node rightHalf = slow.next;
        slow.next = null;

        //Reverse the Right Half
        Node prev = null;
        Node curr = rightHalf;
        Node next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        rightHalf = prev;

        //Alternate Merging
        Node leftHalf = head;
        Node nextLeft, nextRight;

        while(leftHalf!=null && rightHalf!=null)
        {
            nextLeft = leftHalf.next;
            leftHalf.next = rightHalf;
            nextRight = rightHalf.next;
            rightHalf.next = nextLeft;

            leftHalf = nextLeft;
            rightHalf = nextRight;
        }
     }

}
