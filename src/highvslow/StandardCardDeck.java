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
       setCardWeight();
       super.setCardID(value + " of " + suit);
    }

    public void setCardWeight() {
        int multiplier = 0;
        int number = 0;
        //set multiplier
        switch(suit) {
            case CLUBS:
                multiplier = 0;
                break;
            case DIAMONDS:
                multiplier = 13;
                break;
            case HEARTS:
                multiplier = 26;
                break;
            case SPADE:
                multiplier = 39;
                break;
        }
        //set number
        switch(value) {
            case ACE:
                number = 1;
                break;
            case TWO:
                number = 2;
                break;
            case THREE:
                number = 3;
                break;
            case FOUR:
                number = 4;
                break;
            case FIVE:
                number = 5;
                break;
            case SIX:
                number = 6;
                break;
            case SEVEN:
                number = 7;
                break;
            case EIGHT:
                number = 8;
                break;
            case NINE:
                number = 9;
                break;
            case TEN:
                number = 10;
                break;
            case JACK:
                number = 11;
                break;
            case QUEEN:
                number = 12;
                break;
            case KING:
                number = 13;
                break;
        }
        super.setCardWeight(multiplier, number);
    }
    
    //getter methods
    public Value getValue() {
            return this.value;
    }
    public Suit getSuit() {
            return this.suit;
    }
    
}
