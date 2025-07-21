package Arrays.Array2D;

import java.util.Scanner;

/**
 * This class demonstrates the creation and manipulation of a 2D array in Java.
 * It allows the user to input the number of rows and columns, fill the array with elements,
 * and then display the contents of the array.
 */

public class TwoDArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Rows and Columns in your 2D Array");

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] array2D = new int[rows][columns];

        System.out.println("Enter the elements in your 2D Array");

        for(int i = 0; i<rows;i++)
        {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at Row "+(i+1)+" and Column "+(j+1)+" ");
                array2D[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("You,ve Entered: ");
        for(int i = 0; i<rows;i++)
        {
            for (int j = 0; j < columns; j++) {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
