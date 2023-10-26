package programs1to20;

import java.util.Scanner;

/**Program 14
 * Write a Java Program to print the area and perimeter of a rectangle
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14_AreaAndPerimeter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                  //Scanner declaration for reading input from console
        System.out.println("Enter the width of the rectangle : ");
        int width  = scanner.nextInt();
        System.out.println("Enter the height of the rectangle : ");
        int height = scanner.nextInt();
        areaAndPerimeterOfRectangle( width, height);
        scanner.close();                                                           //Closing the scanner object
    }

    public static void areaAndPerimeterOfRectangle(int width, int height)         //Calculating area and perimeter of rectangle
    {
        int perimeter = 2* (height + width);
        int area = (height * width);
        System.out.println(" The area of the rectangle is :  "  + area);
        System.out.println(" The perimeter of the rectangle is :  " + perimeter );
    }
}
