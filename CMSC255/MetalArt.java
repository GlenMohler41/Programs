/***********************************************************
* MetalArt
************************************************************
* Reads in the dimensions of a sculpture and outputs
* the cost of said sculpture as well as the surface area of its
* constituent pieces
* ___________________________________
* Michael Williams
* 2.05.19
* CMSC255-002
*******************************************************/
//the following line imports the Scanner class
import java.util.Scanner;

public class MetalArt {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("MetalArt");
    System.out.println("Reads in the dimensions of a sculpture and outputs\nthe cost of said sculpture as well as the surface area of its\nconstituent pieces");
    System.out.println("Version 2.05.19");
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
    entered to calculate the surface area of each of the shapes and the total surface area,
    as well as the cost of the full structure
    calculations for each shape are separated by an empty line
    pyramid SA = B + .5*3*b*l B = .5*b*sqrt((b^2) - (.5*b)^2) l = sqrt((h^2) +second (.5*b)^2)
    Prism SA = 2*l*w + 2*l*h + 2*w*h
    Total SA = sum of SA of parts
    */
    double firstSlant = Math.sqrt(Math.pow(firstHeight,2) + Math.pow(.5*firstLength,2));
    double firstBase = .5*firstLength*Math.sqrt(Math.pow(firstLength,2) - Math.pow(.5*firstLength,2));
    double firstArea = firstBase + .5*3*firstLength*firstSlant;

    double secondSlant = Math.sqrt(Math.pow(secondHeight,2) + Math.pow(.5*secondLength,2));
    double secondBase = .5*secondLength*Math.sqrt(Math.pow(secondLength,2) - Math.pow(.5*secondLength,2));
    double secondArea = secondBase + .5*3*secondLength*secondSlant;

    double prismArea = 2*prismLength*prismWidth + 2*prismLength*prismWidth + 2*prismWidth*prismHeight;

    double totalArea = prismArea + secondArea + firstArea;
    double totalCost = totalArea*MATERIAL_COST_RATE;

    /* The following block of code outputs the SA of each part to the screen,
    the total SA, and the cost of the structure. printf is used to maintain two decimal places.
    */
    System.out.printf("The Surface Area of the first Pyramid is %,.2f%n", firstArea);
    System.out.printf("The Surface Area of the second Pyramid is %,.2f%n", secondArea);
    System.out.printf("The Surface Area of the Prism is %,.2f%n", prismArea);
    System.out.printf("The Surface Area of %s is %,.2f%n", name, totalArea);
    System.out.printf("The Material Cost of %s is %,.2f%n", name, totalCost);


  }
}
