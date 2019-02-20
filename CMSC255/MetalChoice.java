/***********************************************************
* MetalChoice
************************************************************
* Asks the user for the number of sculptures to be made. Then it
* reads in the dimensions of a sculpture, the desired material, the nameplate
* material, and number of letters, and outputs
* the cost of said sculpture. It does this for each sculpture, then displays the total
* cost. The program continues until the word quit is entered instead of a number of
* sculpture. if gold is chosen as the nameplate material and the name is >10 letters, a $2
* discount is given
* ___________________________________
* Michael Williams
* 2.20.19
* CMSC255-002
*******************************************************/
//the following line imports the Scanner class
import java.util.Scanner;

public class MetalChoice {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("MetalChoice");
    System.out.println("Asks the user for the number of sculptures to be made. Then it reads in the dimensions of a sculpture, the desired material, the nameplate material, and number of letters, and outputs the cost of said sculpture. It does this for each sculpture, then displays the total cost. The program continues until the word quit is entered instead of a number of sculpture. if gold is chosen as the nameplate material and the name is >10 letters, a $2 discount is given");
    System.out.println("Version 2.20.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void main(String [] args){
    printHeading();
    /* The following line creates the scanner that will be used to take inputs.*/
    Scanner scan = new Scanner(System.in);

    // The following lines set as a constant the cost of material
    final double MATERIAL_COST_RATE_ALUMINUM = 1.50;
    final double MATERIAL_COST_RATE_STEEL = 2.85;
    final double MATERIAL_COST_RATE_TITANIUM = 4.50;

    // The following lines set as a constant the cost of the nameplate
    final double NAMEPLATE_COST_BRONZE = 8.00;
    final double NAMEPLATE_COST_SILVER = 12.50;
    final double NAMEPLATE_COST_GOLD = 19.99;


    //The following lines initialize important variables
    double finalCost = 0;
    double costRate = 0;
    double costNameplate = 0;
    /* The following lines instantiate stringSculptures, and start a while loop
    stringSculptures is read in from input, if it is quit, the loop and the program is ended
    if it isn't,the numSculptures is parsed from the string as an int. */
    String stringSculptures="";

    while (true){
      System.out.println("Please enter the number of desired sculpture or enter quit to stop the program.");
      stringSculptures = scan.next();
      if (stringSculptures.equals("quit")) {
        System.out.println("Goodbye!");
        return;
      }
      int numSculptures = Integer.parseInt(stringSculptures);

      //the following line sets finalCost to 0 in order to reset the cost
      finalCost = 0;
      while (numSculptures>0){

        // The following lines ask the user to enter the  desired sculpture material and changes the costRate accordingly
        System.out.println("Please enter the desired material for your sculpture");
        String material = scan.next();
        material = material.toLowerCase();
        if (material.equals("aluminum")==true){
          costRate = MATERIAL_COST_RATE_ALUMINUM;
        } else if (material.equals("steel")==true){
          costRate = MATERIAL_COST_RATE_STEEL;
        } else if (material.equals("titanium")==true){
          costRate = MATERIAL_COST_RATE_TITANIUM;
        }

        // The following lines ask the user to enter the  desired nameplate material and changes the costRate accordingly
        System.out.println("Please enter the desired nameplate material for your sculpture");
        String nameplate = scan.nextLine();
        nameplate = nameplate.toLowerCase();
        if (nameplate.equals("bronze")==true){
          costNameplate = NAMEPLATE_COST_BRONZE;
        } else if (nameplate.equals("silver plated")==true){
          costNameplate = NAMEPLATE_COST_SILVER;
        } else if (nameplate.equals("gold")==true){
          costNameplate = NAMEPLATE_COST_GOLD;
        }

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
        double totalCost = totalArea*costRate;
        totalCost = totalCost + costNameplate;


        /* The following block of code outputs the SA of each part to the screen,
        the total SA, and the cost of the structure. printf is used to maintain two decimal places.
        */
        //System.out.printf("The Surface Area of the first Pyramid is %,.2f%n", firstArea);
        //System.out.printf("The Surface Area of the second Pyramid is %,.2f%n", secondArea);
        //System.out.printf("The Surface Area of the Prism is %,.2f%n", prismArea);
        //System.out.printf("The Surface Area of %s is %,.2f%n", name, totalArea);
        System.out.printf("The Material Cost of %s is %,.2f%n", name, totalCost);

        // the following line decrements the numSculptures counter by 1
        numSculptures = numSculptures - 1;
        finalCost = finalCost + totalCost;
      }
      System.out.printf("The total Cost of all of the sculptures is %,.2f%n", finalCost);
    }

  }
}
