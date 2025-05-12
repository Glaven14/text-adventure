package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Dining extends Rooms {

    /**
     * @param time
     */
    public Dining(int time) {
        super(new ArrayList<>(Arrays.asList(new Food("Cerial"), new Clock(time))));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "This is the dining hall. \n"  
               + "The food here isn't good, but at least you won't starve";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "The Dining Hall";
    }
    
}
