package programs1to20;

import java.util.Scanner;

/** Program 19
 * Write a Java Program to convert a given string into lowercase
 * Sample Input : THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
 * Output: the quick brown fox jumps over the lazy dog
 */
public class Program19_ConvertStringToLowerCase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                               //Scanner declaration for reading input from console
        System.out.println("Enter the uppercase sentence : ");
        String uppercase = scanner.nextLine();
        Program19_ConvertStringToLowerCase t = new Program19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        scanner.close();                                                      //Closing the scanner object
    }

    public void convertStringToLowerCase(String str)                         //Convert string to lowercase
    {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
