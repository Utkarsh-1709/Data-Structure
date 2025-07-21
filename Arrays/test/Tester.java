package Arrays.test;

import java.util.Scanner;

import Arrays.service.Pairs;
import Arrays.service.ReverseArray;
import Arrays.service.SubArray;

public class Tester {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while(!exit){
            System.out.println("Select from the Given Option:-\n1. Reverse an Array\n2. Pairs of an Array\n3. Sub-Arrays of an Array\n4. Maximum Sub-Array Sum\n5. Maximum Sub-Array Sum using Prefix\n6. Maximum Sub-Array Sum using Kadane's Algorithm\n0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the size of an array: ");
                    int size = sc.nextInt();
                    int[] arr = new int[size];
                    System.out.println("Enter " + size + " elements in an Array");
                    for(int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }
                    new ReverseArray().reverseArray(arr);
                    break;

                case 2:
                    System.out.print("Enter the size of an array: ");
                    int size2 = sc.nextInt();
                    int[] arr2 = new int[size2];
                    System.out.println("Enter " + size2 + " elements in an Array");
                    for(int i = 0; i < size2; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    new Pairs().pairsOfArray(arr2);
                    break;

                case 3:
                    System.out.print("Enter the size of an array: ");
                    int size3 = sc.nextInt();
                    int[] arr3 = new int[size3];
                    System.out.println("Enter " + size3 + " elements in an Array");
                    for(int i = 0; i < size3; i++) {
                        arr3[i] = sc.nextInt();
                    }
                    new SubArray().subArrays(arr3);
                    break;
                
                case 4:
                    System.out.print("Enter the size of an array: ");
                    int size4 = sc.nextInt();
                    int[] arr4 = new int[size4];
                    System.out.println("Enter " + size4 + " elements in an Array");
                    for(int i = 0; i < size4; i++) {
                        arr4[i] = sc.nextInt();
                    }
                    new SubArray().maxSubArraySum(arr4);
                    break;
                case 5:
                    System.out.print("Enter the size of an array: ");
                    int size5 = sc.nextInt();
                    int[] arr5 = new int[size5];
                    System.out.println("Enter " + size5 + " elements in an Array");
                    for(int i = 0; i < size5; i++) {
                        arr5[i] = sc.nextInt();
                    }
                    new SubArray().maxSubArraySumUsingPrefix(arr5);
                    break;
                case 6:
                    System.out.print("Enter the size of an array: ");
                    int size6 = sc.nextInt();
                    int[] arr6 = new int[size6];
                    System.out.println("Enter " + size6 + " elements in an Array");
                    for(int i = 0; i < size6; i++) {
                        arr6[i] = sc.nextInt();
                    }
                    new SubArray().maxSubArraySumUsingKadanes(arr6);
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
