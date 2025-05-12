package edu.grinnell.csc207.compression;


/**
 * 
 */
public class Player {
    private Inventory inventory;
    private Rooms curRoom;
    private boolean isHungry;
    private boolean isInjured;
    private boolean hasUniform;
    private boolean hasPCard;
    private int time;

    /**
     * 
     */
    public Player() {
        inventory = new Inventory();
        isHungry = true;
        isInjured = false;
        hasPCard = false;
        time = 0;
        curRoom = new Dorm(time);
    }

    /**
     * @return if player is hungry
     */
    public boolean getHungry() {
        return isHungry;
    }

    /**
     * 
     */
    public void eat() {
        isHungry = false;
    }

    /**
     * @return if player is injured
     */
    public boolean getInjured() {
        return isInjured;
    }

    /**
     * @return if player is holding their uniform
     */
    public boolean getUniform() {
        return hasUniform;
    }

    /**
     * @return how much time player has spent
     */
    public int getTime() {
        return time;
    }

    /**
     * @param minutes
     */
    public void increaseTime(int minutes) {
        time += minutes;
    }

    /**
     * @return what room player is in
     */
    public Rooms getCurRoom() {
        return curRoom;
    }

    /**
     * @return the items player is holding
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param room
     */
    public void setCurRoom(Rooms room) {
        if (room instanceof Bus) {
            if (isInjured) {
                System.out.println("Your coach looks at you and says " 
                                   + "\"You cannot get on the bus if you are injured\"\n" 
                                   + "You should probably go to the Trainers to get that fixed");
            } else if (!hasUniform) {
                System.out.println("Your coach looks at you and says " 
                                   + "\"What are you doing trying to leave without your uniform?\""
                                   + "\nYou should probably go to the Cage to get that");
            } else if (isHungry) {
                System.out.println("Your stomach starts to growl," 
                                   + " you realize you haven't even eaten yet. \n" 
                                   + "Go to Dining to eat.");
            } else {
                curRoom = room;
                System.out.println("You made it to the bus!\n" 
                                   + "Now you must wait for it to leave.");
            }
        } else if (room instanceof Trainers) {
            if (isInjured) {
                System.out.println("The trainer looks at your hand.\n" 
                                   + "\"That should be an easy fix\"\n" 
                                   + "Ten minutes later your hand is wrapped" 
                                   + " and you are back in " + curRoom.getName());
                setInjuredStatus(false);
                
            } else {
                System.out.println("The trainer looks at you.\n" 
                                   + "\"I don't have time to waste on someone not injured\"\n"
                                   + "You are back in " + curRoom.getName());
            }
        } else if (room instanceof Dining) {
            if (!isHungry) {
                System.out.println("You are not hungry so you probably shouldn't come here");
            } else if (!hasPCard) {
                System.out.println("You cannot access this place without your PCard \n" 
                                   + "You probably keep your PCard where you sleep");
            } else {
                Pcard pcard = new Pcard();
                pcard.use();
                curRoom = room;
            }
        } else if (room instanceof Lockers) {
            if (!hasPCard) {
                System.out.println("You cannot access this place without your PCard\n" 
                                   + "You probably keep your PCard where you sleep");
            } else {
                Pcard pcard = new Pcard();
                pcard.use();
                curRoom = room;
            }
        } else {
            curRoom = room;
        }
        
    }

    /**
     * @param status
     */
    public void setInjuredStatus(boolean status) {
        isInjured = status;
    }

    /**
     * @param status
     */
    public void setPcard(boolean status) {
        hasPCard = status;
    }

    /**
     * @param status
     */
    public void setHasUniform(boolean status) {
        hasUniform = status;
    }
}
