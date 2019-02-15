/***********************************************************
* Fibonacci Primes
************************************************************
Prints Fibonacci Primes
*___________________________________
Michael Williams,Caitlin Dela Cruz, Xavier Lakin, Daniel Cordero
2.15.19
CMSC255-002
*******************************************************/
import java.util.Scanner;


public class FibonacciPrimes{
  public static void printHeading() {
    System.out.println("Michael Williams,Caitlin Dela Cruz, Xavier Lakin, Daniel Cordero");
    System.out.println("Fibonacci Primes.");
    System.out.println("Prints Fibonacci Primes");
    System.out.println("Version 2.15.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }
  public static void main(String [] args){
    printHeading();
    Scanner input = new Scanner(System.in);
    int nPrimes = input.nextInt();

    long num1 = 0;
    long num2 = 1;
    long fib = 0;
    long divisor = 2;

    System.out.println(num1);

    while (nPrimes > 0) {
      fib = num1 + num2;
      num1 = num2;
      num2 = fib;
      while (divisor < fib) {
        if ((fib % divisor) == 0){
          divisor = fib + 1;
        }
        else if (num2 == divisor){
          System.out.println(num2);
          nPrimes = nPrimes - 1;
        }
      }
      divisor=2;
    }
  }
}
