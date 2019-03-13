/***********************************************************
* Project 4 CarFacts
************************************************************
* Reads in facts about cars from a data file calculates useful metrics, and outputs these to a txt file
* ___________________________________
* Michael Williams
* 3.11.19
* CMSC255-002
*******************************************************/
//the following lines import the Scanner class, File, FileNotFoundException, and PrintWriter
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WILLIAMS_MICHAEL_PROJECT4 {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("CarFacts");
    System.out.println("");
    System.out.println("Version 3.11.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }

  public static void inputData() throws FileNotFoundException {

    //The following lines initialize important variables.
    int numMiles = 0;
    double tankSize = 0;
    double mileageRating = 0;
    double price = 0;
    double drivabilityScore = 0;
    String makeModel = "";
    double overallValue = 0;
    String mpgName = "";
    double mpgBest = 0;
    String priceName = "";
    double priceBest = 1000000;
    String overallName = "";
    double overallBest = 0;

    //The following lines create a scanner pointed at System.in, and use it to read a file name in from the keyboard
    Scanner keyIn = new Scanner(System.in);
    System.out.println("Please enter the input filename");
    String inFileName = keyIn.nextLine();

    //the following lines open the input file, point a scanner at it, and change the delimiter to \t
    File inFile = new File(inFileName);
    Scanner in = new Scanner(inFile);
    in.useDelimiter("\t");

    //The following line points a PrintWriter at the output file
    PrintWriter out = new PrintWriter("CarFactsOutput.txt");

    //the next line starts the while loop that iterates through each line of the input file
    while (in.hasNext()) {
      //the next lines read in and assign variable values from the file
      makeModel = in.next();
      makeModel = makeModel.trim();
      numMiles = in.nextInt();
      tankSize = in.nextDouble();
      price = in.nextDouble();
      drivabilityScore = in.nextDouble();

      //the next few lines call the methods written to calculate the final metrics and print them to the file
      mileageRating = calcMileageRating(numMiles, tankSize);
      overallValue = calcOverallValue(mileageRating, price, drivabilityScore);
      displayData(makeModel, mileageRating, overallValue, out);

      //the next section tests if the current car's metrics are better than has been seen and if so updates the best yet seen
      if (mpgBest < mileageRating){
        mpgBest = mileageRating;
        mpgName = makeModel;
      }
      if (priceBest > price){
        priceBest = price;
        priceName = makeModel;
      }
      if (overallBest < overallValue){
        overallBest = overallValue;
        overallName = makeModel;
      }

    }
    //the next few lines print the best vehicles for each metric to the output file
    out.printf("\nBest gas mileage is %s at %.2f mpg", mpgName, mpgBest);
    out.printf("\nBest price is %s at $%.2f", priceName, priceBest);
    out.printf("\nBest overall value is %s at a score of %.2f", overallName, overallBest);


    //The following lines close both of the open files
    out.close();
    in.close();
  }

  public static double calcMileageRating(int numMiles, double tankSize){
    return numMiles/tankSize;
  }

  public static double calcOverallValue(double mileageRating, double price, double drivabilityScore){
    return 0.35 * mileageRating + 0.4 * price + 0.25 * drivabilityScore;
  }

  public static void displayData(String makeModel, double mileageRating, double overallValue, PrintWriter out) throws FileNotFoundException {
    out.printf("%s\t%.2f mpg\tValue: %.2f\n", makeModel, mileageRating, overallValue);
  }

  public static void main(String [] args) throws FileNotFoundException {
    printHeading();
    inputData();

  }
}
