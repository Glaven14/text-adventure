package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Pcard extends Items {

    /**
     * 
     */
    public Pcard() {
        super("This acts as a key to get you into your Lockers and the Dining Hall",
              true,
              false,
              true);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Pcard";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Pcard";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("This Item cannot talk.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.print("You use your Pcard to gain access to ");
    }

    
}
