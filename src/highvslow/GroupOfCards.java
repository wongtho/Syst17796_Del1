/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Game Class
 *  Due Date: March 21, 2021
 */

package highvslow;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 */
public class GroupOfCards {
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    //constuctor
    public GroupOfCards(int givenSize){
        size = givenSize;
        cards = new ArrayList<>();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards(){
        return cards;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    //Create full deck
    public void fullDeck () {
        //implemented from ICE 1 and 2
        //for-each loop
        //loop through the number of suits
        for(StandardCardDeck.Suit s: StandardCardDeck.Suit.values()) {
            //loop through the number of values
            for(StandardCardDeck.Value v: StandardCardDeck.Value.values()) {
                //add new card to arrayList
                cards.add(new StandardCardDeck(s, v));
            }
        }
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
