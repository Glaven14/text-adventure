package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Dorm extends Rooms {

    /**
     * @param time
     */
    public Dorm(int time) {
        super(new ArrayList<>(Arrays.asList(new Pcard(), new Clock(time), new Food("Leftovers"))));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "You are in your room. \n" 
               + "Lying on your bed.\n" 
               + "Ready to get going so you don't miss the bus";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Your Dorm Room";
    }
    
}
