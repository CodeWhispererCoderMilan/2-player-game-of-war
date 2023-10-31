

public class Card{
    private int suit;
    private int value;
    //card constructor
    public Card(int suit, int value){
        setSuit(suit);
        setValue(value);
    }

    private String[] Suit = {
        "Hearts","Diamonds","Spades","Clubs"
    };
    private String[] Value = {
        "2","3","4","5","6","7","8","9","10",
        "Jack","Queen","King","Ace"
    };
     public int getValue()
   {
      return value;
   }

  
   public void setValue(int value)
   {
      this.value = value;
   }

   public int getSuit()
   {
      return suit;
   }

   public void setSuit(int suit)
   {
      this.suit = suit;
   }

   //convert card to string 
   public String toCardString()
   {
      return "the "+ Value[getValue()]+" of "+ Suit[getSuit()];
    
   }
   public static void main(String[] args)
   {
     
}
}