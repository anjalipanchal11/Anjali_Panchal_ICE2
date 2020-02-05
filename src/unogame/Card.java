/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author Anjali Panchal
 */
public class Card {
    public enum Suit {RED, YELLOW,GREEN,BLUE};
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, COLOUR, SKIP, REVERSE ,DRAWTWO, DRAWFOUR, WILDCARD};
        private Value value;
        private Suit suit;
        //private final Joker joker;
        //change made in repository
        public Card(Suit s, Value gVal)
        {
           this.suit =s;
           this.value= gVal;
        }
        
        public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}
