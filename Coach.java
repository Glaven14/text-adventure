package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Coach extends Items {

    /**
     * 
     */
    public Coach() {
        super("This is your mentor, benefactor and leader \n" 
             + "Also you can never quite tell if he's mad or just disappointed", 
             false, 
             true,
                false);
    }

    
    @Override
    public String getIntroduction() {
        return "Coach";
    }

    @Override
    public String getName() {
        return "You just call him Coach (with the upmost respect)";
    }

    @Override
    protected void printMessage() {
        System.out.println("Dude we are not waiting for you again," 
                           + " the bus leaves with or without you on it!");
    }

    @Override
    protected void use() {
        System.out.println("It would be a BAD idea to try to use him/");
    }

    
}
