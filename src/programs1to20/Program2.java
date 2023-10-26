package programs1to20;

/** Program 2
 * Write a Java Program using the following steps
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement
 * 2.4 Declare the main method
 * 2.5 Call the static method into the main method and run the program
 */
public class Program2
{
    static int a = 100;                                             // Declare two static variables
    static int b = 200;

    public static void main(String[] args)                        //Declare the main method
    {
        staticMethod();                                          //Call the static method into the main method and run the program
    }
    public static void staticMethod()                          //Declare one static method
    {
        System.out.println(a);                                //Call both static variables into the static method inside the print statement
        System.out.println(b);
    }






}
