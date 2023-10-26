package programs1to20;

/**Program 11
 * Write a Java program to display the following pattern
 * Sample pattern
 * J a v v a
 * J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a a
 */
public class Program11_Javapattern
{
    public static void main(String[] args)
    {
        Program11_Javapattern t = new Program11_Javapattern();
        System.out.println("-------------------------------------------------------");
        t.javaPattern();
    }
    public void javaPattern()                                                        //Printing the Java Pattern
    {
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa v v aaaaa");
        System.out.println("J J a   a v  a  a");
    }
}
