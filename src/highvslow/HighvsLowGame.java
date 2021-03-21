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
    
    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
