public class Deck{
  private Card cards[]=new Card[52];
  private Suit suits[]=Suit.values();
  private Rank ranks[]=Rank.values();
 Deck(){
   int count=0;
   for(int i=0;i<suits.length;i++){
   for(int j=0;j<ranks.length;j++){
      cards[count]=new Card(suits[i], ranks[j]);
      count++;
}
}
}
public void displayDeck(){
    System.out.println("------------DECK------------");
    for(int i=0;i<52;i++)
      System.out.println(cards[i].toString());
}

public void shuffleDeck(){
}



}