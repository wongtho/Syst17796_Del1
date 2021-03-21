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
        
        //players
        for(int i = 0; i < HighvsLow.getPlayers().size(); i++) {
            System.out.println("Player " + (i + 1) + " is: " + HighvsLow.getPlayers().get(i).getPlayerID());
        }
        //start Game
        HighvsLow.play();
    }
    
}
