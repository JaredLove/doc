/******************************************************************************
Programmer: Jared Love 
Date: 08/31/2025
Lab X 
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/
    // Import the Arrays class
import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        // System.out.println("SHUFFLED DECK");
        // shuffleDeck(deck);
        // displayCards(deck);

        // int count = 2;
        // System.out.println("HAND OF " + count + " CARDS");
        // String[] hand = dealCards(deck, count);
        // displayCards(hand);
    }

    private static String[] getDeck() {
        String[] deck = new String[52];
        // add code that creates deck here
            //suites string array
        String[] suites = {"Spades", "Hearts", "Clubs", "Diamonds"};
            //ranks string array
        String[] rank = {"Ace Of ", "2 Of ", "3 Of ", "4 Of ", "5 Of ", "6 Of ", "7 Of ", "8 Of ", "9 Of ", "10 Of ", "Jack Of ", "Queen Of ", "King Of "};
            // counter for the deck string array to add the card to an index
        int counter = 0;
            // for loop to create the deck
        for(int i = 0; i < suites.length; i++){
            for(int j = 0; j < rank.length; j++){
                String card = rank[j] + suites[i];
                deck[counter] = card;
                counter++;
            }
        }
        return deck;
    }

    private static void displayCards(String[] cards) {
        // add code that displays cards here
            //printing the deck of cards using he toString() method fro mthe Arrays Class.
        System.out.println(Arrays.toString(cards));
    }

    private static void shuffleDeck(String[] deck) {
        int randomIndex = (int) (Math.random() * deck.length-1);
        
        // add code that shuffles the deck here
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        return hand;
    }
}