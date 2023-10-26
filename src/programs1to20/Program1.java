package programs1to20;

/** Program 1
 * Write a Java Program using the following steps
 * 1.1 Declare two instance variables
 * 1.2 Declare one instance method
 * 1.3 Call both instance variables into the instance method inside the print statement
 * 1.4 Declare the Main method
 * 1.5 Call the above instance method into the Main method and run the program
 */
public class Program1
{
    int a =10;                                                   //Declare two instance variables
    int b=20;
    public static void main(String[] args)                      //Declare the Main method
    {
        Program1 program1 = new Program1();
        program1.instanceMethod();                            //Call the  instance method into the Main method and run the program
    }
    public void instanceMethod()                             //Declare one instance method
    {
        System.out.println(a);                              //Call both instance variables into the instance method inside the print statement
        System.out.println(b);
    }
}
