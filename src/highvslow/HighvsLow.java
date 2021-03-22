/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Driver Method
 *  Due Date: March 21, 2021
 */
package highvslow;
//import java libraries
import java.util.Scanner;
import java.util.ArrayList;

public class HighvsLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create game title
        final String gameTitle = "High vs Low";
        //initialize game
        HighvsLowGame HighvsLow = new HighvsLowGame(gameTitle);
        //create game players
        ArrayList<Player> gamePlayer = new ArrayList<>();
        PlayerHighLow playerOne = new PlayerHighLow("Thomas");
        PlayerHighLow playerTwo = new PlayerHighLow("ProfMark");
        //set as player arraylist
        gamePlayer.add(playerOne);
        gamePlayer.add(playerTwo);
        //set game players
        HighvsLow.setPlayers(gamePlayer);

        //print out
        //title
        System.out.println("Title of this game is: " + HighvsLow.getGameName());
        //include instructions
        System.out.println("Here are the game instructions: ");
        System.out.println("1. Each player is dealt 5 cards from a shuffled deck of standard 52 cards");
        System.out.println("2. The remaining deck of cards is placed in the middle.");
        System.out.println("3. For every round, 1 card is dealt from the center deck of cards into the round pile.");
        System.out.println("4. Each player must then deal any 1 card from their hand into the round pile at the SAME TIME.");
        System.out.println("5. The player with the highest weighted card that is also higher than the inital dealt card into the round pile wins 1 point.");
        System.out.println("6. Each player draws 2 cards from the middle deck of cards.");
        System.out.println("7. Steps 3 to 6 is repeated until no more cards can be drawn from Step 6.");
        System.out.println("*. The player with the highest total points wins");
        System.out.println("Hint*: Try to deal a card that is closest in value to the initial card but higher than your opponents.");

        //players
        for(int i = 0; i < HighvsLow.getPlayers().size(); i++) {
            System.out.println("Player " + (i + 1) + " is: " + HighvsLow.getPlayers().get(i).getPlayerID());
        }
        //start Game
        HighvsLow.play();
    }
    
}
