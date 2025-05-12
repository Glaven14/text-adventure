package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Hallway extends Items {

    /**
     * 
     */
    public Hallway() {
        super("A long hallway, you can see your Locker room and the Trainers room",
             false, 
             false,
             false);
    }


    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Hallway";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        return "Hallway";
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        System.out.println("You wistle to yourself as you skip down the hallway. \n" 
                           + "Nobody can make fun of you for being excited for gameday. \n"
                           + "Well they can but you won't listen to it.");
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("No you cannot use a Hallway.");
    }
    
}
