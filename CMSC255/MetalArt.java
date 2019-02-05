/***********************************************************
* MetalArt
************************************************************
* Reads in the dimensions of a sculpture and outputs
* the cost of said sculpture as well as the surface area of its
* constituent pieces
*___________________________________
* Michael Williams
* 2.03.19
* CMSC255-002
*******************************************************/
//the following line imports the Scanner class
import java.util.Scanner;

public class MetalArt {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("MetalArt");
    System.out.println("Reads in the dimensions of a sculpture and outputs\nthe cost of said sculpture as well as the surface area of its\nconstituent pieces");
    System.out.println("Version 2.03.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void main(String [] args){
    printHeading();

    /* The following line creates the scanner that will be used to take inputs.*/
    Scanner scan = new Scanner(System.in);

    // The following line sets as a constant the cost of material
    final double MATERIAL_COST_RATE = 1.67;

    /* The following section asks the user for the name of the sculpture,
    the length of the first pyramid's base, the height of the first pyramid,
    the length of the second pyramid's base, the height of the second pyramid,
    and the height, length, and width of the rectangular prism. after user is
    asked for each dimension, it is read in as a double, the name is an exception;
    it is read in as a String */
    System.out.println("Enter the name of your Sculpture");
    String name = scan.nextLine();
    System.out.println("Enter the length of the first pyramid's base (inches)");
    double firstLength = scan.nextDouble();
    System.out.println("Enter the first pyramid's height (inches)");
    double firstHeight = scan.nextDouble();
    System.out.println("Enter the length of the second pyramid's base (inches)");
    double secondLength = scan.nextDouble();
    System.out.println("Enter the second pyramid's height (inches)");
    double secondHeight = scan.nextDouble();
    System.out.println("Enter the height of the rectangular prism (inches)");
    double prismHeight = scan.nextDouble();
    System.out.println("Enter the length of the rectangular prism (inches)");
    double prismLength = scan.nextDouble();
    System.out.println("Enter the width of the rectangular prism (inches)");
    double prismWidth = scan.nextDouble();

    /* The following block of code uses the following equations and the variables
    entered to calculate the surface area of each of the shapes and the total surface area
    pyramid SA = B + .5*3*b*l B = .5*b*sqrt((b^2) - (.5*b)^2) l = sqrt((h^2) + (.5*b)^2)
    Prism SA = 2*l*w + 2*l*h + 2*w*h
    */
    


  }
}
