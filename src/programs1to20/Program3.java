package programs1to20;

/** Program 3
 * Write a Java program using the following steps
 * 3.1 Declare one instance and one static variable
 * 3.2 Declare one instance method
 * 3.3 Declare one static method
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement
 * 3.5 Declare the Main method
 * 3.6 Call both instance and static methods into the main method and run the program
 */
public class Program3
{
    String name = "Prime";                                              //Declare one instance and one static variable
    static String surname = "Testing";

    public static void main(String[] args)                           //Declare the Main method
    {
        Program3 program3 = new Program3();
        staticMethod();                                            //Call both instance and static methods into the main method and run the program
        program3.instanceMethod();
    }
    public void instanceMethod()                                //Declare one instance method
    {
        System.out.println(name);                            //Call both instance and static variables into both instance and static methods inside the print statement
        System.out.println(surname);

    }
    public static void staticMethod()                    // Declare one static method
    {
        System.out.println(surname);                  //Call both instance and static variables into both instance and static methods inside the print statement
        Program3 program3 = new Program3();
        System.out.println(program3 .name);
    }














}
