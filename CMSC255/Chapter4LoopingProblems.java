/***********************************************************
* Chapter4LoopingProblems
************************************************************
* Solves in 5 methods the 5 problems in the Chapter 4 Looping homework assignment
* ___________________________________
* Michael Williams
* 2.20.19
* CMSC255-002
*******************************************************/
//the following line imports the Scanner class
import java.util.Scanner;
import java.util.Random;

public class Chapter4LoopingProblems {
  public static void printHeading() {
    System.out.println("Michael Williams");
    System.out.println("Chapter4LoopingProblems");
    System.out.println("Solves in 5 methods the 5 problems in the Chapter 4 Looping homework assignment");
    System.out.println("Version 2.20.19");
    System.out.println("CMSC255-002");
    System.out.println();
  }



  public static void problem1(){
    //calculates time when present value is 10000 and future value is 20000 if apr is 5%
    int time = 0;
    double futureValue = 10000;
    while (futureValue < 20000){
      futureValue = futureValue*1.05;
      time++;
    }
    System.out.println(time);
  }
  public static void problem2(){
    //calculates the average of a list of positive numbers
    //reads in numbers from user until a negative is entered
    //when that happens, the average is computed by dividing the sum of the
    //entered numbers by the number of numbers counter
    Scanner input = new Scanner(System.in);

    double positiveNumber = 0.0;
    double avgNumber = 0.0;
    int numberOfNumbers = 0;

    while (true){
      positiveNumber = input.nextDouble();
      if (positiveNumber <= 0){
        break;
      } else {
        numberOfNumbers++;
        avgNumber = avgNumber + positiveNumber;
      }
    }
    avgNumber = avgNumber / numberOfNumbers;
    System.out.println(avgNumber);
  }
  public static void problem3(){
    //reads in only values from 0 to 4, loops until a stop value is entered then averages the numbers entered
    //stop value is 5
    Scanner input = new Scanner(System.in);
    int numRatings = 0;
    double avgRating = 0.0;
    int currentRating = -1;
    boolean inputTest = false;
    while (currentRating != 5){
      inputTest = input.hasNextInt();
      while (inputTest == false){
        input.next();
        inputTest = input.hasNextInt();
      }
      currentRating = input.nextInt();
      if (currentRating < 0 || currentRating > 4){
        continue;
      } else {
        avgRating = avgRating + currentRating;
        numRatings++;
      }
    }
    avgRating = avgRating / numRatings;
    System.out.println(avgRating);
  }
  public static void problem4(){
    //generates a random number between 0 and 100, loops until user guesses correct value, tells user if they are too high too low or correct
    Random randomNum = new Random();
    Scanner input = new Scanner(System.in);

    int guess = 999;
    int target = 1 + randomNum.nextInt(100);
    while (guess != target){
      guess = input.nextInt();
      if (guess == target){
        System.out.println("correct");
      } else if (guess < target){
        System.out.println("too low");
      } else if (guess > target){
        System.out.println("too high");
      }
    }
  }
  public static void problem5(){
    //creates a mult table for 1-10 for both row and column
    for (int i = 1; i <= 10; i++){
      for (int j = 1; j <= 10; j++){
        System.out.printf("%,3d ", i*j);
      }
      System.out.println();
    }
  }


  public static void main(String [] args){
    printHeading();

    problem1();
    problem2();
    problem3();
    problem4();
    problem5();



  }
}
