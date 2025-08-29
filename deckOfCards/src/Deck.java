import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {

    public Card[] cards;
    public int count;
    public Card[] dealtCards;


    private class Card {
        public String suit;
        public String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }
    }

    public Deck() {
        cards = new Card[52];
        count = 0;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[count++] = new Card(suits[i], ranks[j]);
            }
        }
    }



    public void Display(){

        System.out.printf("\nCards in deck [%d]..\n",count);

        for(int i =0 ; i < count ; i++){


            System.out.printf("[%d]Suit: [%s]\tRank: [%s]\n", i+1,
                    cards[i].suit,
                    cards[i].rank);

        }




    }


    public void Deal(){

        Scanner scan = new Scanner(System.in);
      
        System.out.printf("\nCards in deck [%d]..\n",count);

        System.out.printf("\nHow many cards to deal?\n");
        int numCards = scan.nextInt();

        dealtCards = new Card[numCards];

        if(numCards > count){
            System.out.printf("\nNot enough cards in deck!\n");
            return;
        }

        System.out.printf("\nDealing %d cards..\n", numCards);

        int j = 0;
        for(int i = 0; i < numCards; i++){
                dealtCards[j] = cards[count - 1];
                cards[count - 1] = null;  
                j++;
                count--; 
        }

        System.out.printf("\nDealt %d cards..\n", j);

        for(int i = 0; i < j; i++){
            System.out.printf("[%d]Suit: [%s]\tRank: [%s]\n", i+1,
                    dealtCards[i].suit,
                    dealtCards[i].rank);
        }

    }


    public void Shuffle() {
  

        System.out.printf("\nShuffling cards..\n");

        Card[] validCards = new Card[count];
        int validIndex = 0;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                validCards[validIndex++] = cards[i];
            }
        }

        for (int i = validIndex - 1; i > 0; i--) {
            int j = new Random().nextInt(i + 1);
            Card temp = validCards[i];
            validCards[i] = validCards[j];
            validCards[j] = temp;
        }
    
        for (int i = 0; i < validIndex; i++) {
            cards[i] = validCards[i];
        }
 
        for (int i = validIndex; i < cards.length; i++) {
            cards[i] = null;
        }

        System.out.printf("\nCards shuffled..\n");
    }




}
