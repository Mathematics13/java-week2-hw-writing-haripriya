package programs1to20;

import java.util.Scanner;

/**Program 17
 * Write a Java Program to convert a decimal number to binary number
 * Input Data:
 * Input a decimal number : 5
 * Expected Output
 * Binary Number is : 101
 */
public class Program17_DecimalToBinary
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Program to convert decimal to binary numbers  ");
        Scanner scanner = new Scanner(System.in);                                   //scanner declaration for reading input from console
        System.out.println("Please enter decimal number ");
        int number = scanner.nextInt();
        convertDecimalToBinary( number);
        scanner.close();                                                          //Closing the scanner object
    }
    public static void convertDecimalToBinary(int number)                        //Converting decimal to binary
    {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
