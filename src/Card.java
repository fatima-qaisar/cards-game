public class Card{
  private Suit suit;
  private Rank rank;
 Card(Suit suit, Rank rank)  {
      this.suit=suit;
      this.rank=rank;
}
public void setRank(Rank rank){
     this.rank=rank;
}
public String toString(){
    return String.format("%s of %s", rank.getRank(), suit.getName());


}
}