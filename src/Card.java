import java.util.Arrays;  

public class Card {
    
    //Declare attributes of a poker card
    String suit;
    String rank;
    String color;
    static String[] allRanks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    static String[] allSuits = {"Diamond", "Club", "Heart", "Spade"};

    //Construtor of the Card class
    public Card(String suit, String rank) {

        this.suit = suit;
        this.rank = rank;
        
        if ((this.suit.equals("Diamond")) || (this.suit.equals("Heart"))) {
            
            this.color = "Red";

        } else {

            this.color = "Black";
        }

    }
    
    //Getter method for the suit of card
    public String getCardSuit() {

        return this.suit;

    }


    //Getter method for the rank of card
    public String getCardRank() {

        return this.rank;

    }
    

    //Getter method for the whole card, returned in String
    public String getPokerCard() {

        String[] singleCard = {this.suit, this.rank};

        return Arrays.toString(singleCard);

    }


    //Check if a card object is valid or not

    public boolean validCard() {
        
        for (int i = 0; i < Card.allRanks.length; i++) {

            for (int j = 0; j < Card.allSuits.length; j++) {

                if ((Card.allRanks[i].equals(this.rank)) && (Card.allSuits[j].equals(this.suit))) {

                    return true;
                
                }
            
            }
        
        }

        return false;
    
    }
    


    //Comparison between two cards and return a card object
    public static Card greaterCard(Card card1, Card card2) {

        String card1Rank = card1.rank;
        String card2Rank = card2.rank;
        String card1Suit = card1.suit;
        String card2Suit = card2.suit;
        int card1RankIndex = 0;
        int card2RankIndex = 0;
        int card1SuitIndex = 0;
        int card2SuitIndex = 0;
        Card nullCard = null;

        if (!(card1.validCard() && card2.validCard())) {

            System.out.println("Invalid card input. Program terminated.");

            System.exit(0);

            return nullCard;

        }

        for (int i = 0; i < allRanks.length; i++) {

            if (allRanks[i] == card1Rank) {

                card1RankIndex = i;

            } 

            if (allRanks[i] == card2Rank) {

                card2RankIndex = i;
                
            }

        }

        if (card1RankIndex > card2RankIndex) {

            return card1;

        }

        if (card1RankIndex < card2RankIndex) {

            return card2;

        }

        for (int i = 0; i < allSuits.length; i++) {

            if (allSuits[i] == card1Suit) {

                card1SuitIndex = i;

            } 

            if (allSuits[i] == card2Suit) {

                card2SuitIndex = i;
                
            }

        }

        if (card1SuitIndex > card2SuitIndex) {

            return card1;

        }

        if (card1SuitIndex < card2SuitIndex) {

            return card2;

        }

        return nullCard;



    }

}
