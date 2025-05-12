package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Batbag extends Items {

    /**
     * 
     */
    public Batbag() {
        super("Without this you cannot play, although that may not be an issue", 
              true,
              false,
              false);
    }

    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Bat bag";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Batbag - Affectionately: Big Bertha, \n Unaffectionately: Peice of crap";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("If you talk to your batbag your crazy, " 
                           + "I mean everyone does it but you're still crazy");  
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("Whoa save it for the field, if you even get there.");
    }
        
}
