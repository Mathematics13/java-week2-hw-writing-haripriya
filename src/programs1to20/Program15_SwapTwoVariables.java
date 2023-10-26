package programs1to20;

import java.util.Scanner;

/**Program 15
 * Write a Java Program to swap two variables
 */
public class Program15_SwapTwoVariables
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                   //Scanner declaration for reading input from console
        System.out.println("Enter the first variable value  : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second  variable value  : ");
        int second  = scanner.nextInt();
        Program15_SwapTwoVariables t = new Program15_SwapTwoVariables();
        t.swapThevalue(first,second);
        scanner.close();                                                           //Closing the scanner object
    }

    public void swapThevalue(int a , int b)                                       //Swapping the value of variables
    {
        int c;
        System.out.println("Before the swapping ,The values of first variable is : " + a + " and second variable is  : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping , the values of first variable is : " + a + " and second variable is : " + b);
    }
    }

















