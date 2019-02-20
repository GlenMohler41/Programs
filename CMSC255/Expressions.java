public class Expressions
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;

    /**********************************************************
     * 3 and 4 are added with sum 7
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println((a + b) / c);

    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println(a + b / c);
    /**********************************************************
     * ++a adds 1 to a and assigns this value to a, thus the answer here,
     * if a is 3 is 4.
     *
     ***********************************************************/
    System.out.println(++a);
    /**********************************************************
     * --a subtracts 1 from a and assigns this value to a, thus the answer here,
     * if a is 3 is 2.
     *
     ***********************************************************/
    System.out.println(--a);
    /**********************************************************
     * a++ adds 1 to a and assigns this value to a, thus the answer here,
     * if a is 3 is 4.
     *
     ***********************************************************/
    System.out.println(a++);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(a--);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(a + 1);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(d % c);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(d / c);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(d % b);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(d / b);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(d + a / d + b);
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println((d + a) / (d + b));
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(Math.sqrt(b));
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(Math.pow(a, b));
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(Math.abs(-a));
    /**********************************************************
     *
     *
     *
     ***********************************************************/
    System.out.println(Math.max(a, b));
  }
}