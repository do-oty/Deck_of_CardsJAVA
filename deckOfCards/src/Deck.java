import java.util.ArrayList;

public class Deck {

    public Card[] cards;
    public int count;


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





}
