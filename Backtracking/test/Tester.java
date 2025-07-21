package Backtracking.test;

import java.util.Scanner;

import Backtracking.service.Backtracking;

/*
 * Tester class for Backtracking example.
 * This class prompts the user to input the size of an array and its elements, then it uses the Backtracking service to modify the array   
 * and display the results.
 */

public class Tester {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Print number of elements to inserted in an array");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" elements in an array");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Backtracking backtracking = new Backtracking();
        backtracking.changeArr(arr, 0, 1);
        System.out.println("Array Elements after Backtracking");
        backtracking.printArr(arr);
        sc.close();
    }
}
