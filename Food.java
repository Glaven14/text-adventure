package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Food extends Items {

    /**
     * @param type
     */
    public Food(String type) {
        super(type, 
             true, 
             false, 
             true);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "food";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "A snack";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("You cannot talk to your food.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("You have eaten " + description);
    }
    
}
