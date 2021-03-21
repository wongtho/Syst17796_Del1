/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Card Class
 *  Due Date: March 21, 2021
 */

package highvslow;
/**
 * This class models 1 single card of a standard deck of 52 cards
 * @author Thomas Wong
 */
public abstract class Card {
        //create Standard deck of 52 card properties
        //implemented from ICE 1 and 2
        public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADE};
        public enum Value{ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        //constructor method
        public Card(Suit s, Value gVal) {
           suit = s;
           value = gVal;
        }
        //getter methods
	public Value getValue() {
		return this.value;
	}
	public Suit getSuit() {
		return this.suit;
        }
    @Override
    public abstract String toString();
    
}
