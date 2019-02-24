/***********************************************************
* NestedLoopTriangle
************************************************************
* Uses nested loops to print two triangles, one right and one equilateral
*___________________________________
* Michael Williams
* 2.19.19
* CMSC255-002
*******************************************************/
import java.util.Scanner;


public class NestedLoopTriangle{
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("NestedLoopTriangle");
    System.out.println("Uses nested loops to print two triangles, one right and one equilateral");
    System.out.println("Version 2.19.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void main(String [] args){
    printHeading();
    Scanner input = new Scanner(System.in);

    for (int i=1; i<=10; i++){
      for (int j = 1; j <= i*2-1; j++){
        System.out.print('*');
      }
      System.out.println();
    }

    for (int i=1; i<=10; i++){
      for (int k = 1; k < 11-i;k++){
        System.out.print(" ");
      }
      for (int j = 1; j <= i*2-1; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }

}
