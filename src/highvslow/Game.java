/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Game Class
 *  Due Date: March 21, 2021
 */

package highvslow;

import java.util.ArrayList;

/**
 * An abstract class that sets the template for all games
 * Game Name
 * Players
 * Play method -> child class needed to further define game properties
 * Declare winner
 * @author Thomas Wong
 */
public abstract class Game {
    //the title of the game
    private final String gameName;
    // the players of the game
    private ArrayList <Player> players;
    
    /**
     * Constructor
     * @param givenName; name of the game
     */
    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() {
        return players;
    }

    /**
     * sets the player names in game
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();
   
}//end class
