package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Lockers extends Rooms {

    /**
     * @param time
     */
    public Lockers(int time) {
        super(new ArrayList<>(Arrays.asList(new Clock(time), 
                                            new Teammates(time), 
                                            new Batbag(), 
                                            new Food("Stale Snacks"))));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "Now this place smells like teen spirit \n"  
               + "Here's were you and you Teammates store all your sports-ball things";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "The Locker Room";
    }
    
}
