package Queue.UsingArray.service;

/**
 * QueueUsingArray class implements a Simple Queue using an Array.
 * It provides methods to add, remove, and peek elements in the queue.
 */

public class QueueUsingArray {
    
    private int arr[];
    private int size;
    private int rear;

    public QueueUsingArray(int n)
    {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty()
    {
        return rear == -1;
    }

    public void add(int data)
    {
        if(rear==size-1)
        {
            System.out.println("Queue is full");
            return;
        }

        rear = rear+1;
        arr[rear] = data;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];

        for(int i = 0; i<rear; i++)
        {
            arr[i] = arr[i+1];
        }

        rear = rear-1;

        return front;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[0];
    }
}
