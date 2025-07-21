package Conversion.service;

/*
 * This class provides methods to convert binary numbers to decimal and vice versa.
 * It includes methods for binary to decimal conversion and decimal to binary conversion.
 */

public class Convert {
     public int binaryToDecimal(String binary)
    {
        int power = 0;
        int decimal = 0;
        for(int i = binary.length()-1;i>=0;i--)
        {
            int digit = binary.charAt(i) - '0';
            decimal +=  digit * Math.pow(2, power);
            power++;
        }
        return decimal;

        //return Integer.parseInt(binary,2);
    }

    public String decimalToBinary(int decimal)
    {
        String binary = "";
        while(decimal>0)
        {
            int digit = decimal%2;
            binary = digit + binary;
            decimal = decimal/2;
        }
        return binary;

        //return Integer.toBinaryString(decimal);
    }
}
