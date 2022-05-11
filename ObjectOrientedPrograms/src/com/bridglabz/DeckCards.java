package com.bridglabz;

public class DeckCards {
    public static String[]cards =new String[52];
    public static String[]suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[]ranks={"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static int n = suits.length * ranks.length;

    public static void main(String[] args) {
        initializeCards();
    }

    private static void initializeCards() {
        int index =0;
        for (int i = 0; i< ranks.length; i++){
            for (int j =0; j < suits.length; j++){
                cards[index] = ranks[i]+ "of" +suits[j];
                index ++;
            }
        }
        System.out.println("deckOfCards: ");
        for (int i = 0; i < n; i++){
            System.out.println(cards[i]);
        }
    }
}

