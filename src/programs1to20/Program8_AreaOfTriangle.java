package programs1to20;

import java.util.Scanner;

/** Program 8
 * Write a program to calculate the area of a triangle
 */

public class Program8_AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                   //Scanner declaration for reading input from console
        System.out.println("Please enter the length of the triangle :  ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle :  ");
        int height= scanner.nextInt();
        areaOfTriangle( length, height);
        scanner.close();                                                          //Closing the scanner object
    }
    public static void areaOfTriangle(int length,int height)
    {
        int area = (length * height )/2;
        System.out.println("The Area of a triangle  is : "  +area );
    }
}
