import java.util.Arrays;  
import java.util.ArrayList;  

public class Deck {
    
    //Constructor of the Deck class
    
    int remainingCards;
    

    public Deck() {

        this.remainingCards = 52;

    }

    public void newDeck() {

        ArrayList <String> cardDeck = new  ArrayList <String>();

        for (int i = 0; i < Card.allSuits.length; i++) {

            for(int j = 0; j < Card.allRanks.length; j++) {

                Card newCard = new Card(Card.allSuits[i], Card.allRanks[j]);

                cardDeck.add(newCard.getPokerCard());

            }
        }

        System.out.println("A new card deck is initialized.");
        System.out.printf("%d cards remaining in the deck %n", this.remainingCards);

    }



}
