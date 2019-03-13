/***********************************************************
* Project 4 CarFacts
************************************************************
* Reads in facts about cars from a data file calculates useful metrics, and outputs these to a txt file
* ___________________________________
* Michael Williams
* 3.11.19
* CMSC255-002
*******************************************************/
//the following line imports the Scanner class
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

  public static inputData(){
    int numMiles = 0;
    double tankSize = 0;
    double mileageRating = 0;
    double price = 0;
    double drivabilityScore = 0;
    double makeModel = 0;
    double overallValue = 0;

  }

  public static double calcMileageRating(int numMiles, double tankSize){

  }

  public static double calcOverallValue(double mileageRating, double price, double drivabilityScore){

  }

  public static void displayData(String makeModel, double mileageRating, double overallValue, PrintWriter out){

  }

  public static void main(String [] args){
    printHeading();
    inputData();

  }
}
