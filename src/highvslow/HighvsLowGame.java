/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 High vs Low Game inherit from Game class
 *  Due Date: March 21, 2021
 */
package highvslow;

//inherit from Game class
import java.util.Random;

public class HighvsLowGame extends Game {
    //Create a full deck of 52 cards for the dealer
    GroupOfCards dealerHand = new GroupOfCards(52);
    //each player starts with 5 cards
    GroupOfCards player1Hand = new GroupOfCards(5);
    GroupOfCards player2Hand = new GroupOfCards(5);
    //create match pile of max 3 cards; 1 each from dealer, player1 and player2
    GroupOfCards centerHand = new GroupOfCards(3);
    
    
    //constructor
    public HighvsLowGame (String gameName) {
        super(gameName);
    }
    
    //play method will be step by step
    @Override
    public void play() {
        //begin game
        System.out.println("Begin Game!!!");
        initalConditions();
        //keep on playing until dealer can no longer deal enough cards for player and center pile
        while(dealerHand.getSize() > 2) {
            nextRound();
        }
    }
    //plays a round
    public void nextRound() {
        //dealer places one card in the center pile
        centerHand.draw(dealerHand.deal(0));
        //player add their cards
        Random rand = new Random();
        centerHand.draw(player1Hand.deal(rand.nextInt(5)));
        centerHand.draw(player2Hand.deal(rand.nextInt(5)));
        //compare
        compare();
        //centerPile discards their hand
        for(int i = 0; i < 3; i++) {
            centerHand.deal(0);
        }
        //each player draws 1 card from dealer
        player1Hand.draw(dealerHand.deal(0));
        player2Hand.draw(dealerHand.deal(0));
        System.out.print("Round finished.");
        //display score
        System.out.println("---- The Score is ------ Player 1: " + super.getPlayers().get(0).getScore() + " --- Player 2: " + super.getPlayers().get(1).getScore());
    }
    /**
     * compare method check who won this round
     */
    public void compare() {
        //centerHand[0] will always be dealer card
        //[1] will be player1 card
        //[2] will be player2 card
        //check player1 card is greater than dealer
        if (centerHand.showCards().get(1).getCardWeight() > centerHand.showCards().get(0).getCardWeight()) {
            //and greater than player 2
            if (centerHand.showCards().get(1).getCardWeight() > centerHand.showCards().get(2).getCardWeight()) {
                //then player 1 wins 1 point
                super.getPlayers().get(0).setWon();
            }
            //else player2 card is greater, it must also be greater than dealer card
            else {
                super.getPlayers().get(1).setWon();
            }
            //player 1 and player 2 cards cannot be equal since all cards are unique.
        }
        //player 1 card is smaller than dealer card
        else {
            //check player 2 card to dealer, if player 2 is greater than dealer
            if (centerHand.showCards().get(2).getCardWeight() > centerHand.showCards().get(0).getCardWeight()) {
                //player 2 wins a point
                super.getPlayers().get(1).setWon();
            }
            //else both player have smaller cards
        }
    }
    /**
     * this methods sets the initial conditions of the game
     * dealers gets the full deck generated & shuffled
     * deals 5 cards to each of the players
     */
    public void initalConditions() {
        //generate full deck
        dealerHand.fullDeck();
        //shuffle dealerHand
        dealerHand.shuffle();
        //display cards in dealer's hands
        for(int i = 0; i < dealerHand.getSize(); i++) {
            System.out.println("Card number " + (i+1) + " has weight: " + dealerHand.showCards().get(i).getCardID());
        }
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
        for(int i = 0; i < player2Hand.getSize(); i++){
            System.out.println("Card number " + (i+1) + " has weight: " + player2Hand.showCards().get(i).getCardWeight());
        }
    }
    
    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
