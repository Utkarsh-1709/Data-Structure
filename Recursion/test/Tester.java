package Recursion.test;

import java.util.Scanner;

import Recursion.service.Recursion;

/*
 * This class serves as a tester for the Recursion class, allowing users to interactively test its methods.
 * It provides options to check if an array is sorted, find the first occurrence of an element,
 * find the last occurrence of an element, and solve the tiling problem.
 */

public class Tester {
    
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while(!exit)
        {
            System.out.println("Select the Option:\n1. Check if an Array is Sorted or not\n2. Find the first occurrence of an Element\n3. Find the first occurrence of an Element\n4. Tiling Problem\n0. Exit");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.println("Enter the Size of an Array");
                    int size = sc.nextInt();
                    int arr[] = new int[size];
                    System.out.println("Enter "+size+" elements in an Array");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println(recursion.isSorted(arr, 0)); 
                    break;
                case 2:
                    System.out.println("Enter the Size of an Array");
                    int size1 = sc.nextInt();
                    int arr1[] = new int[size1];
                    System.out.println("Enter "+size1+" elements in an Array");
                    for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = sc.nextInt();
                    }
                    System.out.print("Enter the Element to be Searched: ");
                    int key = sc.nextInt();
                    System.out.println(recursion.firstOccurrence(arr1, key, 0)); 
                    break;
                case 3:
                    System.out.println("Enter the Size of an Array");
                    int size2 = sc.nextInt();
                    int arr2[] = new int[size2];
                    System.out.println("Enter "+size2+" elements in an Array");
                    for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    System.out.print("Enter the Element to be Searched: ");
                    int key1 = sc.nextInt();
                    System.out.println(recursion.firstOccurrence(arr2, key1, size2-1)); 
                    break;
                case 4:
                    System.out.println("Enter the no. of tiles");
                    System.out.println("No. of ways are: "+recursion.numberOfWays(sc.nextInt()));
                    break;
                case 0:
                    exit = true;
                    break;
                
            }
        }
        sc.close();
    }

}
