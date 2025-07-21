package CircularQueue.test;

import java.util.Scanner;

import CircularQueue.service.CircularQueueUsingArray;

/*
 * Tester class for CircularQueueUsingArray
 * This class allows user interaction to test the Circular Queue operations.
 */

public class Tester {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();
        
        CircularQueueUsingArray cQueue = new CircularQueueUsingArray(size);

        System.out.println("Enter "+size+" elements in an array");
        int arr[] = new int[size];

        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
            cQueue.insert(arr[i]);
        }

        cQueue.delete();
        cQueue.insert(5);
        cQueue.delete();
        cQueue.insert(20);

        while(!cQueue.isEmpty())
        {
            System.out.print(cQueue.peek()+" ");
            cQueue.delete();
        }
        System.out.println();
        sc.close();
    }
}
