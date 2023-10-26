package programs1to20;

import java.util.Scanner;

/** Program 6
 * Write a Java Program to enter any radius value of the circle and find out the area.
 * Formula of Area A = pi*r*r
 */

public class Program6_AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner scanner = new   Scanner(System.in);             //Scanner declaration for reading input from console
        System.out.println("Enter the radius :  ");
        double radius = scanner.nextDouble();
        areaOfCircle (radius);
        scanner.close();                                     //closing the scanner object
    }

    public static void areaOfCircle (double radius)     //Calculating the area of circle
    {
        double pi = Math.PI;
        double area = (pi*radius*radius);
        System.out.println("The Area of circle is :  " + area );
    }















}
