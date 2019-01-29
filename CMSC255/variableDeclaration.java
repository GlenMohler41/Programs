/***********************************************************
* Lab 3 - variable declarations
************************************************************
*delcares and initializes variables
*___________________________________
Michael Williams
1.29.19
CMSC255-002
*******************************************************/

public class variableDeclaration {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("Lab 3 - variable declarations");
    System.out.println("delcares and initializes variables");
    System.out.println("Version 1.29.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void main(String [] args){
    printHeading();
    System.out.println("Michael Williams and Hank Madden, CMSC255-002");
    byte numPeople = 3;
    double itemPrice = 32.32;
    boolean flag = false;
    char dataValue = 'a';
    System.out.println("numPeople = " + numPeople);
    System.out.println("itemPrice = " + itemPrice);
    System.out.println("flag = " + flag);
    System.out.println("dataValue = " + dataValue);
    /**********************************************
    * modified value of the numPeople variable
    **********************************************/
    numPeople = 6;
    itemPrice = 64.12;
    flag = true;
    dataValue = 'q';
    System.out.println("numPeople = " + numPeople);
    System.out.println("itemPrice = " + itemPrice);
    System.out.println("flag = " + flag);
    System.out.println("dataValue = " + dataValue);

    final double PI = 3.14159;
    final int RC = 24;
    final byte MAX = 127;
    final boolean TRUEFLAG = true;
    //TRUEFLAG = false;
    System.out.println("PI = " + PI);
    System.out.println("RC = " + RC);
    System.out.println("MAX = " + MAX);
    System.out.println("TRUEFLAG = " + TRUEFLAG);

  }
}
