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
    //card value is equal to card number + suit where Clubs = 1 Diamonds = 2, Hearts = 3 and Spades = 4
    //Jack = 11, Queen = 12, King = 13
    private String CardID;
    private int cardWeight;
    
    public Card () {
        cardWeight = 0;
    }
    
    public void setCardWeight(int multiplier, int number) {
        this.cardWeight = multiplier + number;
    }
    public int getCardWeight(){
        return cardWeight;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
}
