import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    private  int contestantType;
    
    public SimContestant (Random randoms, int ct) {
        myRandoms = randoms;
        contestantType = ct;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = 1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor) {
      if(contestantType== 0)
        return myInitialGuess;
    if(contestantType == 1)
        return 6- myInitialGuess - openedDoor;
    else
        if((int)(Math.random()*2)==0){
            return myInitialGuess;


        }
        else 
            return 6-myInitialGuess-openedDoor;
    

    }
}
