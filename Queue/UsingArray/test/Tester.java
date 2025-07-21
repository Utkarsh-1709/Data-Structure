package Queue.UsingArray.test;

import java.util.Scanner;

import Queue.UsingArray.service.QueueUsingArray;

/**
 * Tester class to demonstrate the functionality of QueueUsingArray.
 * It allows users to input elements into the queue and displays them.
 */

public class Tester {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array");
        size = sc.nextInt();

        System.out.println("Enter the "+size+" elements in an array");
        int arr[] = new int[size];
        QueueUsingArray queue = new QueueUsingArray(size);
        for(int i = 0; i<size;i++)
        {
            arr[i] = sc.nextInt();
            queue.add(arr[i]);
        }

        while(!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            queue.remove();
        }
        System.out.println();

        sc.close();
    }
}
