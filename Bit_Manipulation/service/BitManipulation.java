package Bit_Manipulation.service;

/*
 * This class provides methods for various bit manipulation operations.
 * It includes methods for bitwise AND, OR, XOR, one's complement,left shift, right shift, checking even/odd, getting, setting,
 * clearing, and updating bits at a specific position.
 * Each method performs a specific operation on integers using bitwise operators.
 * The methods are designed to be efficient and straightforward, leveraging the properties of binary arithmetic.
 */
public class BitManipulation {

    public int bitwiseAND(int a, int b)
    {
        return a&b;
    }

    public int bitwiseOR(int a, int b)
    {
        return a|b;
    }

    public int bitwiseXOR(int a, int b)
    {
        return a^b;
    }

    public int onesComplement(int a)
    {
        return ~a;
    }

    public int leftShift(int a, int b)
    {
        return a<<b;                        //Shifts the binary value of a to the left by b steps. 
        //internally it implements the formula of a<<b = a * Math.pow(2,b)
    }

    public int rightShift(int a, int b)
    {
        return a>>b;                        //Shifts the binary value of a to the right by b steps. 
        //internally it implements the formula of a<<b = a / Math.pow(2,b)
    }

    public String evenOdd(int a)
    {
        int n = 1;
        if((a&n) == 0)
            return "Even";
        else
            return "Odd";
    }

    public int getIthBit(int n, int i)      //get Ith bit of the given number
    {
        int bitMask = 1<<i;
        if((n&bitMask)==0)
            return 0;
        else
            return 1;
    }

    public int setIthBit(int n, int i)      // set Ith bit of the given number to 1; 
    {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public int clearIthBit(int n, int i)        //change the Ith bit of number to 0;
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public int updateIthBit(int n, int i, int newBit)       //0-->1 or 1-->0
    {
        if(newBit==0)
            return clearIthBit(n, i);
        else
            return setIthBit(n, i);
    }
}
