package edu.grinnell.csc207.compression;

import java.util.Scanner;

/**
 * 
 */
public class TextAdventure {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Usage: java TextAdventure");
        }

        Parser parser = new Parser();
        Scanner userInput = new Scanner(System.in);
        int twoHours = 120;

        System.out.println("Welcome to Game Day Student-Athlete Simulator! \n" 
                           + "Your goal is to make it to the bus before it leaves. \n" 
                           + "There are probably things you need to do before you get on the bus " 
                           + "\nBut you just woke up and can't quite remember them right now. \n" 
                           + "All you know for sure is the bus leaves in two hours (120 minutes)\n" 
                           + "Good luck!");

        while (!parser.getExit() && parser.player.getTime() <= twoHours) {
            System.out.println("What would you like to do?"); 
            String input = userInput.nextLine();
            parser.parse(input);
            System.out.println("You are holding: " 
                               + parser.player.getInventory().toString() 
                               + "\n" 
                               + "You are in " 
                               + parser.player.getCurRoom().getName() 
                               + "\n" 
                               + "You have: " 
                               + (twoHours - parser.player.getTime())  
                               + " minutes to get on the bus\n" 
                               + "---------------------------\n\n");
        }
        if (parser.player.getCurRoom() instanceof Bus) {
            System.out.println("Congratulations!! " 
                               + "You survived the basic expectation of being a student-athlete"
                               + "\nYour reward is to sit on the bench and watch the team play.\n"
                               + "But at least coach will let you go to practice tomorrow.");
        } else if (parser.player.getTime() > twoHours) {
            System.out.println("So sorry you missed the bus. " 
                               + "There goes your chances of ever playing again.");
        }
        userInput.close();
    }
}