class Hand 
{
    //A DECK AND 2 HANDS OF 2 CARDS
    private final Deck deck;
    private final Card[] hand1;
    private final Card[] hand2;
  
    public Card[] getHand1(){
        return hand1;
    }
    public Card[] getHand2(){
        return hand2;
    }
    //sum of card values for specific hand
    static int sum(Card[] cards){
        int sum= cards[0].getValue()+cards[1].getValue();
        return sum;
    }
    //deals a hand to 2 players
   public Hand()
   {
            deck = new Deck();
            deck.shuffle();
            hand1 = new Card[2];
            hand2 = new Card[2];
            for (int i = 0; i < 2; i++){
                hand1[i] = deck.takeCard();
                hand2[i] = deck.takeCard();
            }
    }
    // deal a hand, print player cards then print who won by comparing sum value for both hands
    public static void main(String[] args)
   {
        Hand hand = new Hand();
        System.out.println("\nHand 1:\n");
        for (Card card : hand.getHand1()){
                System.out.println(card.toCardString());
        }
        System.out.println("\nHand 2:\n");
        for (Card card : hand.getHand2()){
                System.out.println(card.toCardString());
        }
        if(sum(hand.getHand1())>sum(hand.getHand2())){
            System.out.println("\n\n hand 1 wins \n\n");
        }else if(sum(hand.getHand1())==sum(hand.getHand2())){
            System.out.println("\n\n hands are tied \n\n");
        }else{
            System.out.println("\n\n hand 2 wins \n\n");
        }
    }
    
}
