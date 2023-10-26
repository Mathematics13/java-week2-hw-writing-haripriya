package programs1to20;

import java.util.Scanner;

/**Program 13
 * Write a Java Program that takes three numbers as input to calculate and print the average of the numbers
 */
public class Program13_AverageOfNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                          //Scanner declaration for reading input from console
        System.out.println("Enter the first number:  ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number:  ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number:  ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers( x, y,  z);
        scanner.close();                                                                   //Closing the Scanner object
    }

    public static void averageOfThreeNumbers(double a,double b, double c)                 //Calculation the average of three numbers
    {
        double average = (a+b+c)/3;
        System.out.println("The average of " + a + " , " + b + " and " + c + " is : " + average );
    }
}
