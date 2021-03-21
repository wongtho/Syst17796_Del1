/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Standard Card Deck inherit from Card Class
 *  Due Date: March 21, 2021
 */
package highvslow;
//inherit from Card Class
public class StandardCardDeck extends Card {
    //create Standard deck of 52 card properties
    //implemented from ICE 1 and 2
    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADE};
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private final Suit suit;
    private final Value value;
    //constructor method
    public StandardCardDeck(Suit s, Value gVal) {
       super();
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
    
}
