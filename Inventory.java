package edu.grinnell.csc207.compression;

import java.util.ArrayList;

/**
 * 
 */
public class Inventory {
    ArrayList<Items> inventory;

    /**
     * 
     */
    public Inventory() {
        inventory = new ArrayList<Items>();
    }

    /**
     * @param newItem
     */
    public void addItem(Items newItem) {
        inventory.add(newItem);
        System.out.println("Added " + newItem + " to inventory");
    }

    /**
     * @param item
     * @return true iff the item can be found in players inventory
     */
    public boolean contains(Items item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        String ret = "";
        if (!inventory.isEmpty()) {
            ret += inventory.get(0).getIntroduction();
        }
        for (int i = 1; i < inventory.size(); i++) {
            ret += ", " + inventory.get(i).getIntroduction();
        }
        return ret;
    }

    /**
     * @param item
     */
    public void remove(Items item) {
        int ind = 100;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(item)) {
                ind = i;
            }
        }
        if (ind != 100) {
            inventory.remove(ind);
    
        }
    }

}