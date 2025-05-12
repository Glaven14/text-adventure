package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Uniform extends Items {

    /**
     * 
     */
    public Uniform() {
        super("The cleanest set on the team. Pants, socks, jersey, and hat all there", 
             true, 
             false,
             false);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Uniform";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Today it's the dark night, Black top, gray pants, black hat, socks, and belt.";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("Yeah don't talk to your uniform, the Cagemaster will get jealous.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("You want to be comfy for the bus ride so you won't put it on yet.");
    }
    
}
