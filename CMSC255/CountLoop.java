/***********************************************************
* CountLoop
************************************************************
* finds the sum of 1 to 100 using a for loop while loop and do while loop
*___________________________________
* Michael Williams
* 2.19.19
* CMSC255-002
*******************************************************/
import java.util.Scanner;


public class CountLoop{
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("CountLoop");
    System.out.println("finds the sum of 1 to 100 using a for loop while loop and do while loop");
    System.out.println("Version 2.19.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void main(String [] args){
    printHeading();
    Scanner input = new Scanner(System.in);

    System.out.println("Please type the desired n, where n is the highest number added");
    int n = input.nextInt();

    //The following counts the sum of 1 to 11 with a while loop
    int counter = 0;
    int sum = 0;
    while (counter <= n) {
      sum = sum + counter;
      counter++;
    }
    System.out.println(sum);

    //The following counts the sum of 1 to 11 with a for loop
    sum = 0;
    for (int i = 0; i <= n; i++){
      sum = sum + i;
    }
    System.out.println(sum);

    //The following counts the sum of 1 to 11 with a do while loop
    counter = 0;
    sum = 0;
    do {
      sum = sum + counter;
      counter++;
    }  while (counter <= n);
    System.out.println(sum);
  }
}
