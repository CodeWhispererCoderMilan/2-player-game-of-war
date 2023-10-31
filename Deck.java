public class Deck 
{
   private final Card[] cards;
   private int topcard;
 //Deck constructor
   public Deck()
   {
      cards = new Card[52];
      initDeck();
   }
   //Deck initialization build an unshuffled new deck
   public void initDeck()
   {

        int i = 0;
        for (int suit = 0; suit<4;suit++){
            for (int rank = 0; rank < 13; rank++){

                cards[i] = new Card(suit,rank);
                if(i == 51) continue;
                i++;
            }
        }
        topcard=i;
    }


    //shuffle deck by switching cards
   public void shuffle()
   {

      for (int cardnr = 0; cardnr<=topcard; cardnr++) {

         int cardSwapTo =(int) Math.floor(Math.random() * (topcard+1));
            while (cardnr==cardSwapTo){
                cardSwapTo =(int) Math.floor(Math.random() * (topcard+1));
            }
         
         Card aux = cards[cardSwapTo];
         cards[cardSwapTo] = cards[cardnr];
         cards[cardnr] = aux;
      }
      
   }
   //check if deck empty
   public boolean empty()
   {
      return topcard < 0;
   }
   
   //take top card
   public Card takeCard()
   {
      Card aux = cards[topcard];
      topcard--;
    return aux ;
      
   }
   //print deck
   public void showDeck()
   {
      if (empty()) {
         System.out.println("The deck is empty.");
         return;
      }

      System.out.println("\nThe current deck:");
      for (Card card : cards)
         System.out.println("   "+card.toCardString());
   }

   public static void main(String[] args){}

}