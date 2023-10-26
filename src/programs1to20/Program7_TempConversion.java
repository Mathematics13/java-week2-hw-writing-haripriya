package programs1to20;

import java.util.Scanner;

/** Program 7
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F-32) * 5/9 = 0°C)
 */
public class Program7_TempConversion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                         //Scanner declaration for reading input from console
        System.out.println("Enter the temperature in fahrenheit  : ");
        float temp = scanner.nextFloat();
        Program7_TempConversion t = new Program7_TempConversion();     //Object Creation
        t.convertTempToDegreeCelsius(temp);
        scanner.close();                                            //Closing the scanner object
    }
    public void convertTempToDegreeCelsius(float temp)
    {
        float c = ((temp-32) * 5/9);
        System.out.println("The temperature  " + temp + " fahrenheit is equal to "  + c + " degree celsius ");
    }












}
