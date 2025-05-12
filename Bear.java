package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Bear extends Rooms {

    /**
     * @param time
     */
    public Bear(int time) {
        super(new ArrayList<>(Arrays.asList(new Food("Snacks"), new Clock(time), new Hallway())));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "The athletic center (known as the Bear). \n" 
               + "Here you can visit the Cage, Lockers, and Trainers. \n"
               + "This is basically were you live as a student-athlete";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "The Bear Athletic Center";
    }
    
}
