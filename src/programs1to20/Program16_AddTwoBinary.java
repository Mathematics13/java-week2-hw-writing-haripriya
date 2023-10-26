package programs1to20;

import java.util.Scanner;

/** Program 16
 * Write a Java Program to add two binary numbers
 * Input Data:
 * Input first binary number : 10
 * Input second binary number : 11
 */
public class Program16_AddTwoBinary
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java program to add two binary numbers ");
        Scanner scanner = new Scanner(System.in);                                   //Scanner declaration for reading input from console
        System.out.println("Please enter first binary number  ");
        String first = scanner.nextLine();
        System.out.println("Please enter second binary number ");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is : " +addition);
        scanner.close();                                                          //Closing the scanner object
    }
       public static String addTwoBinaryNumbers(String first,String second)      //Adding two binary numbers
       {
           int b1 = Integer.parseInt(first, 2);
           int b2 = Integer.parseInt(second,2);
           int sum = b1+b2;
           return Integer.toBinaryString(sum);
       }
}
