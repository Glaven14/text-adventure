package edu.grinnell.csc207.compression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Cage extends Rooms {

    /**
     * @param time
     */
    public Cage(int time) {
        super(new ArrayList<>(Arrays.asList(new Clock(time), new Uniform(), new CageMaster())));
    }

    /**
     * 
     */
    @Override
    public String getDescription() {
        return "This is where your uniforms get washed and stored \n" 
               + "If you were good enough to go D1 they'd return your jersey to your locker \n" 
               + "But you're not.";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "The Cage";
    }
    
}
