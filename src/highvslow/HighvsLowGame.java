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
        //display cards in dealer's hands
        for(int i = 0; i < dealerHand.getSize(); i++) {
            System.out.println("Card number " + (i+1) + " has weight: " + dealerHand.showCards().get(i).getCardWeight());
        }
        //each player starts with 5 cards
        GroupOfCards player1Hand = new GroupOfCards(5);
        GroupOfCards player2Hand = new GroupOfCards(5);
        //distribute cards
        for(int i = 0; i < 5; i++) {
            player1Hand.draw(dealerHand.deal(0));
            player2Hand.draw(dealerHand.deal(0));
        }
        System.out.println("----------------------------");
        for(int i = 0; i < player1Hand.getSize(); i++){
            System.out.println("Card number " + (i+1) + " has weight: " + player1Hand.showCards().get(i).getCardWeight());
        }
        System.out.println("----------------------------");
        for(int i = 0; i < player1Hand.getSize(); i++){
            System.out.println("Card number " + (i+1) + " has weight: " + player2Hand.showCards().get(i).getCardWeight());
        }
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
