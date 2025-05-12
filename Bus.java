package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Bus extends Rooms {

    /**
     * @param time
     */
    public Bus(int time) {
        super(new ArrayList<>(Arrays.asList(new Clock(time), new Coach())));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "Better be on it before it leaves. \n"  
               + "If you don't you Coach will be pissed " 
               + "and you'll be watching the game on a screen " 
               + "instead of your usual spot on the bench";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "The Bus";
    }
    
}
