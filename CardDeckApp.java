/******************************************************************************
Programmer: Jared Love 
Date: 08/31/2025
Lab X 
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
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
            //using the join method for joining strings with a delimiter / pipe character
        String result = String.join(" | ", cards);
        System.out.println(result);
    }

    private static void shuffleDeck(String[] deck) {
        // add code that shuffles the deck here
        for(int i = 0; i < 20; i++){
                // Two random numbers to use for swapping
            int randomIndex1 = (int) (Math.random() * deck.length-1);
            int randomIndex2 = (int) (Math.random() * deck.length-1);
                //set the variable copy equal the the value of that index of the deck array
            String copy = deck[randomIndex1];
                //checking for dupes
            if(randomIndex1 == randomIndex2){
                System.out.println("dupe");
            }else{
                    // setting the value of the first random index equal to the second
                deck[randomIndex1] = deck[randomIndex2];
                    // setting the second random index equal to the copy we made of the first
                deck[randomIndex2] = copy;
            }
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
            // for loop to deal cards to playing depending on the count that was set
        for(int i = 0; i < count; i++){
            hand[i] = deck[i];
        }
        return hand;
    }
}