package Searching.test;

import java.util.Scanner;

import Searching.service.BinarySearch;
import Searching.service.LinearSearch;

/**
 * Tester class to demonstrate Linear and Binary search functionalities.
 * This class provides a menu-driven interface for users to perform searches on arrays.
 * It allows users to input an array and a key to search for, and displays the result
 * indicating whether the key was found and its position in the array.
 */

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        LinearSearch linearSearch = new LinearSearch();

        BinarySearch binarySearch = new BinarySearch();

        boolean exit = false;

        while(!exit)
        {
            System.out.println("Select from the Given Option:-\n1. Linear Search\n2. Binary Search\n0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the size of an array: ");
                    int size = sc.nextInt();
                    int arr[] = new int[size];
                    System.out.println("Enter "+size+" elements in an Array");
                    for(int i = 0; i<size;i++)
                    {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the key to be searched");
                    int key = sc.nextInt();
                    int found = 0;
                    found = linearSearch.linearSearch(arr, key);
                    if(found>0) 
                    {
                        System.out.println("Key found at: "+found);
                    }
                    else 
                    {
                        System.out.println("Provided Key is not present in an array");
                    } 
                    break;
                
                case 2:
                    System.out.print("Enter the size of an array: ");
                    int size2 = sc.nextInt();
                    int sortedArr[] = new int[size2];
                    System.out.println("Enter "+size2+" elements in an Array in Sorted Form");
                    for(int i = 0; i<size2;i++)
                    {
                        sortedArr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the key to be searched");
                    int newKey = sc.nextInt();
                    int newFound = 0;
                    newFound = binarySearch.binarySearch(sortedArr, newKey);
                    if(newFound>0) System.out.println("Key found at: "+newFound);
                    else System.out.println("Provided Key is not present in an array");
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        sc.close();
    }

}
