/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: Deliverable 1 Game Class
 *  Due Date: March 21, 2021
 */

package highvslow;
    
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 */
public abstract class Player {
    //the unique ID for this player
    private String playerID;
    private int score;
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
        score = 0;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }
    public int getScore() {
        return score;
    }

    public void setWon() {
        this.score++;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
