package edu.grinnell.csc207.compression;

import java.util.ArrayList;

/**
 * 
 */
public abstract class Rooms {
    ArrayList<Items> itemsAvailable;

    /**
     * @param itemsAvailable
     */
    public Rooms(ArrayList<Items> itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    /**
     * 
     */
    public void lookAround() {
        String ret = "";
        ret = itemsAvailable.toString();
        System.out.println(ret);
    }

    /**
     * @param item
     * @return true Iff the the item is in the room.
     */
    public boolean inRoom(Items item) {
        for (int i = 0; i < itemsAvailable.size(); i++) {
            if (itemsAvailable.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param room
     * @param time
     * @return a room based on the string
     */
    public static Rooms isRoom(String room, int time) {
        switch (room) {
            case "dorm":
                return new Dorm(time);
            case "dining":
                return new Dining(time);
            case "bear":
                return new Bear(time);
            case "bus":
                return new Bus(time);
            case "lockers": 
                return new Lockers(time);
            case "cage":
                return new Cage(time);
            case "trainers": 
                return new Trainers();
            default:
                return null;
        }
        
    }

    /**
     * 
     */
    @Override
    public String toString() {
        String ret = "";
        if (!itemsAvailable.isEmpty()) {
            ret += itemsAvailable.get(0).getIntroduction();
        }
        for (int i = 1; i < itemsAvailable.size(); i++) {
            ret += ", " + itemsAvailable.get(i).getIntroduction();
        }
        return ret;
    }

    /**
     * @return the description
     */
    public abstract String getDescription();

    /**
     * @return a name
     */
    public abstract String getName();
    
}