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

    //the follwoing lines set as constants the pricing for letters
    final double FIRST_FIVE_LETTERS = 19.99;
    final double SIX_TO_TEN_LETTERS = 2.5;
    final double OVER_TEN_LETTERS = 1.85;


    //The following lines initialize important variables that are used in this program
    double finalCost = 0;
    double costMaterial = 0;
    double costNameplate = 0;
    double discount = 0;
    int letterCount = 0;
    double costLetters = 0;
    boolean inputTest = true;
    String stringSculptures="";


    /* The following lines start a while loop and stringSculptures is read in from input, if it is quit, the loop and the program is ended
    if it isn't,the numSculptures is parsed from the string as an int. inputTest is used to determine if the values read in to stringSculptures
    are an integer*/
    while (true){
      System.out.println("Please enter the number of desired sculptures or enter quit to stop the program.");
      inputTest=scan.hasNextInt();
      stringSculptures = scan.next();
      if (stringSculptures.equals("quit")) {
        System.out.println("Goodbye!");
        return;
      }

      //thefollowing lines use inputTest to refuse bad inputs
      while (inputTest==false){
        System.out.println("try again");
        inputTest=scan.hasNextInt();
        stringSculptures = scan.next();
        if (stringSculptures.equals("quit")) {
          System.out.println("Goodbye!");
          return;
        }
      }

      int numSculptures = Integer.parseInt(stringSculptures);

      //the following lines set finalCost & discount to 0 in order to reset the cost and discount
      finalCost = 0;
      discount = 0;

      while (numSculptures>0){

        //The following two lines ask the user for the name of their sculpture and reads it in
        System.out.println("Enter the name of your Sculpture");
        String name = scan.nextLine();
        name = scan.nextLine();


        // The following lines ask the user to enter the  desired sculpture material and changes the costMaterial accordingly in addition, it will keep looping if none of the inputs are valid
        while (true){
          System.out.println("Please enter the desired material for your sculpture");
          String material = scan.next();
          material = material.toLowerCase();
          if (material.equals("aluminum")==true){
            costMaterial = MATERIAL_COST_RATE_ALUMINUM;
            break;
          } else if (material.equals("steel")==true){
            costMaterial = MATERIAL_COST_RATE_STEEL;
            break;
          } else if (material.equals("titanium")==true){
            costMaterial = MATERIAL_COST_RATE_TITANIUM;
            break;
          }
        }

        // The following lines ask the user to enter the  desired nameplate material and changes the costMaterial accordingly
        // string nameplate is initialized before entering a loop that prevents bad inputs
        String nameplate = "";
        while(true){
          System.out.println("Please enter the desired nameplate material for your sculpture");          nameplate = scan.nextLine();
          nameplate = scan.nextLine();
          nameplate = nameplate.toLowerCase();
          if (nameplate.equals("bronze")==true){
            costNameplate = NAMEPLATE_COST_BRONZE;
            break;
          } else if (nameplate.equals("silver plated")==true){
            costNameplate = NAMEPLATE_COST_SILVER;
            break;
          } else if (nameplate.equals("gold")==true){
            costNameplate = NAMEPLATE_COST_GOLD;
            break;
          }
        }
        /*The following lines count the letters that go on the nameplate
        it is unclear whether numbers or total characters are to be counted,
        so this counts all non whitespace characters in the name*/
        letterCount = 0;
        for (int i=0;i<name.length();i++){
          if (Character.isWhitespace(name.charAt(i))){

          } else {
            letterCount++;
          }
        }

        /*The following lines use the letterCount to set the Letter price
        They also, by including an if statemenet within the over 10 letters branch
        set the discount using the discount condition of over 10 letters and gold nameplate*/
        if (letterCount <= 5){
          costLetters = FIRST_FIVE_LETTERS;
        } else if (letterCount <= 10){
          costLetters = FIRST_FIVE_LETTERS + (letterCount - 5)*SIX_TO_TEN_LETTERS;
        } else {
          costLetters = FIRST_FIVE_LETTERS + (letterCount - 5)*OVER_TEN_LETTERS;
          if (nameplate.equals("gold")==true){
            discount = 2;
            costNameplate = costNameplate - discount;
          }
        }

        /* The following section asks the user for the length of the first pyramid's base, the height of the first pyramid,
        the length of the second pyramid's base, the height of the second pyramid,
        and the height, length, and width of the rectangular prism. after user is
        asked for each dimension, it is read in as a double, the name is an exception;
        it is read in as a String */
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
        double totalCost = totalArea*costMaterial;
        totalCost = totalCost + costNameplate + costLetters;

        /* The following block of code outputs the SA of each part to the screen,
        the total SA, and the cost of the structure. printf is used to maintain two decimal places.
        */
        //System.out.printf("The Surface Area of the first Pyramid is %,.2f%n", firstArea);
        //System.out.printf("The Surface Area of the second Pyramid is %,.2f%n", secondArea);
        //System.out.printf("The Surface Area of the Prism is %,.2f%n", prismArea);
        //System.out.printf("The Surface Area of %s is %,.2f%n", name, totalArea);

        //the following line outputs the cost of the current sculpture
        System.out.printf("The Material Cost of %s is %,.2f%n", name, totalCost);

        // The following line decrements the numSculptures counter by 1
        numSculptures = numSculptures - 1;

        // The followwing line increments the cost for all the sculptures by the cost of the current sculpture
        finalCost = finalCost + totalCost;
      }
      //the following line outputs the final cost of all of the sculptures
      System.out.printf("The total Cost of all of the sculptures is %,.2f%n", finalCost);
    }

  }
}
