import java.util.Random;

public class testin{

public static int montyHall(int guess123){
    Random ran = new Random();
//System.out.print("firstguess ");
//System.out.println(guess123);
    final int actual = ran.nextInt(3)+1;
    int changeguess=0;//=ran.nextInt(2);
//System.out.print("change ");
//System.out.println(changeguess);
    int reveal=ran.nextInt(3)+1;
//System.out.print("initial reveal ");
//System.out.println(reveal);

//System.out.print("actual ");
//System.out.println(actual);
//System.out.print("reveal ");
//System.out.println(reveal);
while (reveal==actual||reveal==guess123){
reveal=ran.nextInt(3)+1;
//System.out.print("revealchange ");
//System.out.println(reveal);
}

if (changeguess==1){
//System.out.print("old guess ");
//System.out.println(guess123);
guess123=(6-reveal-guess123);
//System.out.print("new guess ");
//System.out.println(guess123);
//System.out.print("reveal used ");
//System.out.println(reveal);

}
    if (guess123==actual){
        return 1;
    } else {
        return 0;       
  }
  }  

public static double montyRuns(int numruns){
double tally=0;
Random ran = new Random();
for (int i=1;i<=numruns;i++){
int x = montyHall(ran.nextInt(3)+1);
tally+=x;
}
tally = tally /numruns;
return tally;
}

public static void main(String[] args){
//int x = montyHall(1);
//System.out.print("x = ");
//System.out.println(x);
//int y = montyHall(2);
//System.out.print("y = ");
//System.out.println(y);
//int z = montyHall(3);
//System.out.print("z = ");
//System.out.println(z);
double x=montyRuns(1000000);
System.out.println(x);
double third =1.0/3.0;
double error = Math.abs((x-third)/third);
System.out.print("error is ");
System.out.println(error);
}

}
