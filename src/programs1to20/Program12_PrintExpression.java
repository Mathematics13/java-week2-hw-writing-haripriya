package programs1to20;

/**Program 12
 * Write a Java Program to compute the specified expressions and print the output
 * Test data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5-4.5))
 * Expected Output : 2.138888888888889
 */
public class Program12_PrintExpression
{
    public static void main(String[] args)
    {
        Program12_PrintExpression t = new Program12_PrintExpression();
        t.printExpressions();
    }
    public void printExpressions()
    {
    double a = ((25.5 * 3.5 -3.5 * 3.5 ) / (40.5 - 4.5));                              //Printing Expression
    System.out.println(a);
    }
}
