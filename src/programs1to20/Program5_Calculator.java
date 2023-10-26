package programs1to20;

import java.util.Scanner;

/**
 * Program 5
 * Write a program for a calculator with addition,subtraction,multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods)
 */
public class Program5_Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                            //Scanner declaration for reading input from console
        System.out.println("Please enter first number :  ");
        int a =  scanner.nextInt();
        System.out.println("Please enter second number :  ");
        int b =  scanner.nextInt();
        addition(a , b);
        int subResult =  subtraction( a , b);
        System.out.println("The subtraction of " + a + " and "  + b + " is : " + subResult );
        Program5_Calculator obj = new Program5_Calculator();
        obj.multiplication(a,b);
        int divResult =  obj.division(a,b);
        System.out.println("The division of " + a + " and "  + b + " is : " + divResult);
        scanner.close();                                             //Closing the scanner class
    }
    public static void addition(int a ,int b)                            //static methods
    {
        int result = a+b;
        System.out.println("The addition of " + a + " and "  + b + " is : " + result);
    }
    public static int subtraction(int a ,int b)                      //static methods
    {
       return a-b;
    }
    public  void multiplication(int a ,int b)                  //instance  methods
    {
        int result = a*b;
        System.out.println("The multiplication of " + a + " and "  + b + " is : " + result);
    }
    public  int division(int a ,int b)                     //instance  methods
    {
        return a/b;
    }
}
