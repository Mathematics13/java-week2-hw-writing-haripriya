package programs1to20;

import java.util.Scanner;

/** Program 10
 * Write a Java Program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number : 8
 * Expected Output:
 * 8 * 1 = 8
 * 8 * 2 = 16
 * 8 * 3 = 24
 * ......
 * 8 * 10 = 80
 */
public class Program10_MultiplicationTable
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);                           //Scanner declaration for reading input from console
        System.out.println("Please enter the number  : ");
        int number = scanner.nextInt();
        multiplicationTableOf( number);
        scanner.close();                                                 //Closing the scanner object
    }
    public static void multiplicationTableOf(int number)               //Printing the multiplication table of entered number
    {
        System.out.println( number + " x " + 1  + " =  "  +        (number));
        System.out.println( number + " x " + 2  + " =  "  +    (number * 2));
        System.out.println( number + " x " + 3  + " =  "  +    (number * 3));
        System.out.println( number + " x " + 4  + " =  "  +    (number * 4));
        System.out.println( number + " x " + 5  + " =  "  +    (number * 5));
        System.out.println( number + " x " + 6  + " =  "  +    (number * 6));
        System.out.println( number + " x " + 7  + " =  "  +    (number * 7));
        System.out.println( number + " x " + 8  + " =  "  +    (number * 8));
        System.out.println( number + " x " + 9  + " =  "  +    (number * 9));
        System.out.println( number + " x " + 10 + " =  "  +   (number * 10));
    }
}
