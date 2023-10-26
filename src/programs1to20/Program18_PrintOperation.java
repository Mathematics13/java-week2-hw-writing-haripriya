package programs1to20;

import java.util.Scanner;

/** Program 18
 * Write a Java Program to print the sum (addition) , multiply, subtract ,divide and remainder of two numbers
 * Test Data:
 * Input first number : 125
 * Input second number : 24
 * Expected Output:
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 * 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18_PrintOperation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                               //Scanner declaration for reading input from console
        System.out.println("Enter the first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number ");
        int secondNumber = scanner.nextInt();
        Program18_PrintOperation printOperation = new Program18_PrintOperation();
        printOperation.printTheOperation(firstNumber,secondNumber);
        scanner.close();                                                                        //Closing the scanner object
    }
    public void printTheOperation(int a , int b)                                               //Printing all the operations
    {
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a-b));
        System.out.println("The product of " + a + " and " + b + " is " + (a*b));
        System.out.println("The division of " + a + " and " + b + " is " + (a/b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a%b));
    }
}
