package Conversion.test;

import java.util.Scanner;

import Conversion.service.Convert;

/**
 * This class serves as a tester for the conversion functionalities.
 * It provides a menu-driven interface to test binary to decimal and decimal to binary conversions.
 */

public class Tester {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        Convert convert = new Convert();

        while(!exit)
        {
            System.out.println("Select from the Given Option:-\n1. Binary To Decimal\n2. Decimal To Binary\n0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter a Binary Number:- ");
                    System.out.println("Corresponding Decimal No.:- "+convert.binaryToDecimal(sc.next()));
                    break;

                case 2:
                    System.out.println("Enter a Decimal Number:- ");
                    System.out.println("Corresponding Binary Number.:- "+convert.decimalToBinary(sc.nextInt()));
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
