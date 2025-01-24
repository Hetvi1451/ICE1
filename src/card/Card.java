/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Card;


public class Card {
    private int value;
    private String suit;

    // Constructor
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    // Default Constructor (if needed)
    public Card() {
    }

    // Getters
    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}