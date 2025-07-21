package CircularQueue.service;

/*
 * Circular Queue Implementation using Array
 * This implementation supports basic operations like insert, delete, and peek.
 * It also checks if the queue is empty or full.
 */

public class CircularQueueUsingArray {
    
    private int arr[];
    private int size;
    private int front;
    private int rear;

    public CircularQueueUsingArray(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty()
    {
        return rear == -1 && front == -1;
    }

    public boolean isFull()
    {
        return (rear+1)%size == front;
    }

    public void insert(int data)
    {
        if(isFull())
        {
            System.out.println("Circular Queue is Full");
            return;
        }

        if(front == -1)
        {
            front = 0;
        }
        rear = (rear + 1)%size;
        arr[rear] = data; 
    }

    public int delete()
    {
        if(isEmpty())
        {
            System.out.println("Circular queue is Empty");
            return -1;
        }

        int result = arr[front];

        //last element delete
        if(front == rear)
        {
            front = rear = -1;
        }
        else{
            front = (front+1)%size;
        }

        return result;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Circular queue is Empty");
            return -1;
        }

        return arr[front];
    }
}
