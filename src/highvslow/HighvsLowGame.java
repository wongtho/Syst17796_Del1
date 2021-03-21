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
        //set initial game conditions
        initalConditions();
        //keep on playing until dealer can no longer deal enough cards for player and center pile
        while(dealerHand.getSize() > 2) {
            nextRound();
        }
        //display winner
        declareWinner();
    }
    //plays a round
    public void nextRound() {
        //dealer places one card in the center pile
        centerHand.draw(dealerHand.deal(0));
        System.out.println();
        System.out.println("Center Card is weight: " + centerHand.showCards().get(0).getCardWeight());
        //player add their cards
        Random rand = new Random();
        //draws a random card from 0 to 4 index
        centerHand.draw(player1Hand.deal(rand.nextInt(5)));
        System.out.println(super.getPlayers().get(0).getPlayerID() + " deals card with weight: " + centerHand.showCards().get(1).getCardWeight());
        centerHand.draw(player2Hand.deal(rand.nextInt(5)));
        System.out.println(super.getPlayers().get(1).getPlayerID() + " deals card with weight: " + centerHand.showCards().get(2).getCardWeight());
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
        System.out.println(" The Score: Player 1: " + super.getPlayers().get(0).getScore() + " ----- Player 2: " + super.getPlayers().get(1).getScore());
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
                System.out.println(super.getPlayers().get(0).getPlayerID() + " won this round.");
            }
            //else player2 card is greater, it must also be greater than dealer card
            else {
                super.getPlayers().get(1).setWon();
                System.out.println(super.getPlayers().get(1).getPlayerID() + " won this round.");
            }
            //player 1 and player 2 cards cannot be equal since all cards are unique.
        }
        //player 1 card is smaller than dealer card
        else {
            //check player 2 card to dealer, if player 2 is greater than dealer
            if (centerHand.showCards().get(2).getCardWeight() > centerHand.showCards().get(0).getCardWeight()) {
                //player 2 wins a point
                super.getPlayers().get(1).setWon();
                System.out.println(super.getPlayers().get(1).getPlayerID() + " won this round.");
            }
            //else both player have smaller cards
            else {
                System.out.println("Nobody won this round.");
            }
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
        System.out.println("Secret dealer cards: Uncomment below lines to see ");
//        for(int i = 0; i < dealerHand.getSize(); i++) {
//            System.out.println("Card number " + (i+1) + ": " + dealerHand.showCards().get(i).getCardID() + " has weight: " + dealerHand.showCards().get(i).getCardWeight());
//        }
        //distribute cards
        for(int i = 0; i < 5; i++) {
            player1Hand.draw(dealerHand.deal(0));
            player2Hand.draw(dealerHand.deal(0));
        }
        //reset hand size since draw increments by 1
        player1Hand.setSize(5);
        player2Hand.setSize(5);
        System.out.println("Player 1, your initial hand is: --------------------");
        for(int i = 0; i < player1Hand.getSize(); i++){
            System.out.println("Card number " + (i+1) + ": " + player1Hand.showCards().get(i).getCardID() + " has weight: " + player1Hand.showCards().get(i).getCardWeight());
        }
        System.out.println("Player 2, your initial hand is: --------------------");
        for(int i = 0; i < player2Hand.getSize(); i++){
            System.out.println("Card number " + (i+1) + ": " + player2Hand.showCards().get(i).getCardID() + " has weight: " + player2Hand.showCards().get(i).getCardWeight());
        }
    }
    
    @Override
    public void declareWinner() {
        //check winning conditions
        //if player one score is higher than player 2
        if(super.getPlayers().get(0).getScore() > super.getPlayers().get(1).getScore()) {
            //player 1 wins
            System.out.println("You won player: " + super.getPlayers().get(0).getPlayerID());
        }
        //else if player one is less than player 2
        else if(super.getPlayers().get(0).getScore() < super.getPlayers().get(1).getScore()) {
            //player 2 wins
            System.out.println("You won player: " + super.getPlayers().get(1).getPlayerID());
        }
        //else it is a tie
        else {
            System.out.println("It is a tie.");
        }
    }
    
}
