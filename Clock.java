package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Clock extends Items {

    /**
     * @param time
     */
    public Clock(int time) {
        super("This clock reads " + time, 
                false, 
                false, 
                false);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Clock";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Clock";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("You cannot talk to the clock.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("This clock cannot be used");
    }
    
}
