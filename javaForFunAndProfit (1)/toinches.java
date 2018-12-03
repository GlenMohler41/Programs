import java.util.Scanner;

public class toinches {

  public static void main(String[] args){
      //System.out.println("Hello World.");
      Scanner in =new Scanner(System.in);
      final double CM_2_IN=2.54;
      double inches;
      int cm=in.nextInt();
      inches = cm/CM_2_IN;
      System.out.print("This is the amount of inches: ");
      System.out.println(inches);
  }
}
