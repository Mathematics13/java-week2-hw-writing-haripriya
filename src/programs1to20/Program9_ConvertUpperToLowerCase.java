package programs1to20;

import java.util.Scanner;

/**Program 9
 * Write a program to convert the upper case to lower case
 */
public class Program9_ConvertUpperToLowerCase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);                         //Scanner declaration for reading input from console
        System.out.println("Enter the uppercase string :  ");
        String uppercase = scanner.nextLine();
        Program9_ConvertUpperToLowerCase t = new Program9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase );
        scanner.close();                                                  //Closing the scanner object
    }
    public void convertUpperCaseToLowerCase(String text)                 //Conversion of Uppercase to Lowercase method
    {
        System.out.println("The Lowercase value is  :  " +  text.toLowerCase() );
    }

}
