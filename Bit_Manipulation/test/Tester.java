package Bit_Manipulation.test;

import java.util.Scanner;

import Bit_Manipulation.service.BitManipulation;

/*
 * This class serves as a tester for the BitManipulation class.
 * It prompts the user to enter two integers and then performs various bit manipulation operations using the methods from BitManipulation.
 * The results of each operation are printed to the console.
 */
public class Tester {
    
    public static void main(String[] args) {

        BitManipulation bm = new BitManipulation();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Bitwise AND "+bm.bitwiseAND(a, b));

        System.out.println("Bitwise OR "+bm.bitwiseOR(a, b));

        System.out.println("Bitwise XOR "+bm.bitwiseXOR(a, b));

        System.out.println("One's Complement "+bm.onesComplement(a));

        System.out.println("Left Shift "+bm.leftShift(a, b));

        System.out.println("Right Shift "+bm.rightShift(a, b));

        System.out.println("Given no. is "+bm.evenOdd(a));

        System.out.println("Given no. is "+bm.getIthBit(a, b));

        System.out.println("Given no. is "+bm.setIthBit(a, b));

        System.out.println("Given no. is "+bm.clearIthBit(a, b));

        sc.close();
    }
}
