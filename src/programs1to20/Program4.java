package programs1to20;

/** Program 4
 * Write a Java Program using the following steps
 * 4.1 Declare two instance and two static variables
 * 4.2 Declare one instance method
 * 4.3 Declare one static method
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement
 * 4.5 Declare the main method
 * 4.6 Call both instance and static methods into the main method and run the program
 */
public class Program4
{
    String name = "Prime";                                                 // Declare two instance  variables
    String surname = "Testing";
    static boolean a = true;                                            //Declare  two static variables
    static boolean b = false;

    public static void main(String[] args)                           //Declare the main method
    {
        staticMethod();
        Program4 program4 = new Program4();
        program4.instanceMethod();
    }
    public void instanceMethod()                                 //Declare one instance method
    {
        System.out.println(a);                                //Call all four instance and static variables into both instance and
        System.out.println(b);                               // static methods inside the print statement
        System.out.println( name);
        System.out.println(surname);
    }
    public static void staticMethod()                   //Declare one static method
    {
        System.out.println(a);                        // Call all four instance and static variables into both instance and
        System.out.println(b);                       // static methods inside the print statement
        Program4 program4 = new Program4();
        System.out.println(program4.name);
        System.out.println(program4.surname);
    }










}
