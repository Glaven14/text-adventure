package edu.grinnell.csc207.compression;

/**
 * 
 */
public class CageMaster extends Items {

    /**
     * 
     */
    public CageMaster() {
        super("He's trying his best.", 
              false,
              true, 
              false);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Cage Master";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Idk probably Dave just say please and thank you.";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("Are you missing anything? ... No? Then leave me alone.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("It's probably not politically correct to use Dave.");
    }
    
}
