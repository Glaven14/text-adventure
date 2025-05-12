package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Teammates extends Items {
    private int time;

    /**
     * @param time
     */
    public Teammates(int time) {
        super("These are your brothers, your best friends, "               
              + "and the most annoying people on the face of the earth", 
              false,
              true, 
              false);
        this.time = time;
    }

    
    /**
     * 
     */
    @Override
    public String getIntroduction() {
        return "Teammates";
    }

    /**
     * 
     */
    @Override
    public String getName() {
        if (time < 30) {
            return "Yeah you are really early - "  
                   + "that is they would say that if they were here";
        }
        if (time < 60) {
            return "His name is Eddyyy, he lives here.";
        }
        if (time < 90) {
            return "Too many to list, you know them as your teammates";
        }
        if (time < 120) {
            return "Only a few lag behind now";
        } else {
            return "Well, the good news is " 
                   + "your teammates aren't here to clown you for missing the bus. \n" 
                   + "The bad news is you definitely missed the bus.";
        }
    }

    /**
     * 
     */
    @Override
    protected void printMessage() {
        if (time < 30) {
            System.out.println("Yeah you are really early - "  
                               + "is what your teammates would say if they were here");
        } else if (time < 60) {
            System.out.println("Only one guy is in the locker room with you. "  
                               + "He wants to talk shop, but you tell him you're busy");
        } else if (time < 90) {
            System.out.println("Too many to list, you know them as your teammates");
        } else if (time < 120) {
            System.out.println("We gotta go, the bus is leaving soon");
        } else {
            System.out.println("Well, the good news is " 
                               + "your teammates aren't here to clown you for missing the bus. \n"  
                               + "The bad news is you definitely missed the bus.");
        }
    }

    /**
     * 
     */
    @Override
    protected void use() {
        System.out.println("Never use your teammates.");
    }
    
}
