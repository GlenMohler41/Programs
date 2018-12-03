import java.util.Random;

public class Deck{
  private Card[] cards;
  public Deck(int n) {
    this.cards = new Card[n];

  }

  public Deck() {
    this.cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <= 3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        this.cards[index] = new Card(rank, suit);index++;
      }
    }
  }

  public void shuffle(int n){
    for (int i=0; i<n; i++){
      int x = this.randomIndex();
      int y = this.randomIndex();
      this.swapCards(x,y);
    }
  }

  public void swapCards(int one, int two){
    Card x = this.cards[one];
    Card y = this.cards[two];
    this.cards[two]=x;
    this.cards[one]=y;
  }

  public int randomIndex(){
    Random rand = new Random();
    return rand.nextInt(this.cards.length);
  }

  public int indexLowest(int begin){
    int lowest=begin;
    for (int i=begin;i<this.cards.length;i++){
      if (this.cards[i].compareTo(this.cards[lowest])==-1){
        lowest=i;
      }
    }
    return lowest;
  }

  public int indexLowest(){
    int lowest=0;
    for (int i=0;i<this.cards.length;i++){
      if (this.cards[i].compareTo(this.cards[lowest])==-1){
        lowest=i;
      }
    }
    return lowest;
  }

  public void selectionSort(){
    for (int i=0;i<this.cards.length;i++){
      int x = this.indexLowest(i);
      this.swapCards(i,x);
    }
  }

  public void print(){
    for (int i=0;i<this.cards.length;i++){
      System.out.println(this.cards[i]);
    }
  }

  public static void main(String[] args){
    System.out.println("works");
    Card ten = new Card(2,3);
    Deck elev = new Deck();
    //System.out.println(ten);
    elev.shuffle(100000);
    elev.selectionSort();
    elev.print();

  }

}
