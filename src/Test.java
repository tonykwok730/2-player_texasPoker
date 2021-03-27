public class Test {
    
    public static void main(String[] args) {

        Card card1 = new Card("Heart", "5");
        Card card2 = new Card("Spade", "3");
        Card card3 = new Card("Club", "3");
        Card card4 = new Card("Joker", "Black");
        Deck deck1= new Deck();
        

        System.out.println(card1.getCardRank());
        System.out.println(card2.getCardSuit());
        System.out.println(card3.getPokerCard());
        System.out.println(Card.greaterCard(card1, card2).getPokerCard());
        System.out.println(Card.greaterCard(card1, card2).getPokerCard());
        System.out.println(Card.greaterCard(card2, card3).getPokerCard());
        System.out.println(card4.validCard());
        deck1.newDeck();
        
    }

}
