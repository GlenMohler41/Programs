import java.util.Random;

public class MontyHall {

  public static int montyHall(int guess123){
      Random ran = new Random();
      final int actual = ran.nextInt(3)+1;
    int changeguess=ran.nextInt(2);
    int reveal=(6-actual-guess123);//line wont give right answer if truth == guess

    if (changeguess==1){
    guess123=(6-reveal-guess123); //line wont give right answer if truth == guess
    }
    if (guess123==actual){
        return 1;
    } else {
        return 0;       
  }
  }

    public static double montyRuns(int numruns){
     Random ran = new Random();
     double talley=0;
        for (int i=1;i<=numruns;i++){   
      int y= montyHall(ran.nextInt(3)+1);
        talley+=y;            
         
     }
        return (talley/numruns);
    }
    
    

  public static void main(String[] args){
    double finalverdict;
    finalverdict =montyRuns(200);
    System.out.println(finalverdict);
  }

}