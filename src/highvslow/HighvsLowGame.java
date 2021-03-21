/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 High vs Low Game inherit from Game class
 *  Due Date: March 21, 2021
 */
package highvslow;

//inherit from Game class

public class HighvsLowGame extends Game {
    
    //constructor
    public HighvsLowGame (String gameName) {
        super(gameName);
    }
    
    //play method will be step by step
    @Override
    public void play() {
        //begin game
        System.out.println("Begin Game!!!");
        //Create a full deck of 52 cards
        GroupOfCards dealerHand = new GroupOfCards(52);
        //generate full deck
        dealerHand.fullDeck();
        //shuffle dealerHand
        dealerHand.shuffle();        
        for(int i = 0; i < dealerHand.getSize(); i++) {
             System.out.println("Card number " + (i+1) + " has weight: " + dealerHand.showCards().get(i).getCardWeight());
        }
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
