package edu.grinnell.csc207.compression;

/**
 * 
 */
public class Parser {
    Player player;
    boolean exit;

    /**
     * 
     */
    public Parser() {
        player = new Player();
        exit = false;
    }

    /**
     * @return exits program
     */
    public boolean getExit() {
        return exit;
    }

    /**
     * @param userInput
     */
    public void parse(String userInput) {
        String words[] = userInput.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (word.equals("help")) {
                System.out.println("List of Commands: \n" 
                                 + "Wait - Let 5 minutes pass \n" 
                                 + "Look around - Get the name of each item in the current room \n"
                                 + "Go <Room> - Move to the specified room \n" 
                                 + "Talk to <Person> - Try to talk to a person within the room \n" 
                                 + "Pick up <Item> - Take item from room to put in inventory \n" 
                                 + "Use <Item> - Uses item from inventory \n" 
                                 + "Look at <Item> - A description of item in room/inventory \n" 
                                 + "Attack <Item> - Attack an item" 
                                 + "Exit - ends game");

                System.out.println("List of Rooms: \n" 
                                   + "Dorm \n" 
                                   + "Dining \n" 
                                   + "Bear \n" 
                                   + "Trainers \n" 
                                   + "Cage \n" 
                                   + "Locker \n" 
                                   + "Bus");
                i = words.length;
            } else if (word.equals("wait")) {
                System.out.println("Waiting 5 minutes");
                player.increaseTime(5);
                i = words.length;
            } else if (word.equals("look")) {
                String nextWord = "null";
                if (words.length - i > 1) {
                    nextWord = words[i + 1].toLowerCase();
                }
                if (nextWord.equals("at")) {
                    Items item = null;
                    if (words.length - i > 2) {
                        item = Items.isItem(words[i + 2].toLowerCase(), player.getTime());
                    }
                    if (item == null) {
                        System.out.println("I'm sorry it appears that item doesn't exist");
                        i = words.length;
                    } else if (player.getCurRoom().inRoom(item)  
                               || player.getInventory().contains(item)) {
                        System.out.println(item.getDescription());
                        player.increaseTime(1);
                        i = words.length;
                    }
                } else {
                    System.out.print("You see: ");
                    player.getCurRoom().lookAround();
                    player.increaseTime(1);
                    i = words.length;
                }
            } else if (word.equals("go")) {
                Rooms room1 = null;
                Rooms room2 = null;
                if (words.length - i > 2) {
                    room1 = Rooms.isRoom(words[i + 1].toLowerCase(), player.getTime());
                    room2 = Rooms.isRoom(words[i + 2].toLowerCase(), player.getTime());
                }
                if (room1 != null) {
                    player.setCurRoom(room1);
                    System.out.println(room1.getDescription());
                    i = words.length;
                    player.increaseTime(10);
                } else if (room2 != null) {
                    player.setCurRoom(room2);
                    System.out.println(room2.getDescription());
                    i = words.length;
                    player.increaseTime(10);
                } else {
                    System.out.println("Please select one of the following rooms to go to: \n" 
                                       + "List of Rooms: \n" 
                                       + "Dorm \n" 
                                       + "Dining \n"
                                       + "Bear \n" 
                                       + "Trainers \n" 
                                       + "Cage \n" 
                                       + "Lockers \n" 
                                       + "Bus");
                    i = words.length;
                }
            } else if (word.equals("talk")) {
                Items person = null;
                if (words.length - i > 2) {
                    person = Items.isItem(words[i + 2].toLowerCase(), player.getTime());
                }
                if (person == null) {
                    System.out.println("Please enter a person in the room to talk to");
                    i = words.length;
                } else {
                    System.out.print(person.getIntroduction() + " says: ");
                    person.printMessage();
                    i = words.length;
                    player.increaseTime(2);
                }
            } else if (word.equals("pick")) {
                if (words.length - i > 2) {
                    Items item = Items.isItem(words[i + 2].toLowerCase(), player.getTime());
                    if (item == null || !(player.getCurRoom().inRoom(item))) { 
                        // if item is not in room or item doesn't exist
                        System.out.println("Please enter an item in the room to pick up");
                        i = words.length;
                    } else if (item.getPickUp()) {
                        player.getInventory().addItem(item);
                        player.increaseTime(1);
                        if (item instanceof Pcard) {
                            player.setPcard(true);
                        }
                        if (item instanceof Uniform) {
                            player.setHasUniform(true);
                        }
                        i = words.length;
                    } else {
                        System.out.println("Sorry, you cannot pick up that item");
                        i = words.length;
                    }
                } else {
                    System.out.println("Please enter an item in the room to pick up \n" 
                                       + "Pick up <Item>."); 
                    i = words.length;
                }
            } else if (word.equals("use")) {
                if (words.length - i > 1) {
                    Items item = Items.isItem(words[i + 1].toLowerCase(), player.getTime());
                    if (item == null || !(player.getInventory().contains(item))) { 
                        // if item is not in inventory or item doesn't exist
                        System.out.println("Please enter an item in your inventory to use");
                        player.getInventory().toString();
                        i = words.length;
                    } else if (item.getUse()) {
                        item.use();
                        if (item instanceof Food) {
                            player.getInventory().remove(item);
                            player.eat();
                            player.increaseTime(14);
                        }
                        player.increaseTime(1);
                        i = words.length;
                    } else {
                        System.out.println("Sorry, you cannot use that item");
                        i = words.length;
                    }
                } else {
                    System.out.println("Please enter an item in the room to pick up \n" 
                                       + "Pick up <Item>."); 
                    i = words.length;
                }
            } else if (word.equals("attack")) {
                Items item = null;
                player.increaseTime(2);
                if (words.length - i > 1) {
                    item = Items.isItem(words[i + 1].toLowerCase(), player.getTime());
                }
                i = words.length;
                if (item == null || !(player.getCurRoom().inRoom(item))) {
                    // if item is not in current room or item doesn't exist
                    System.out.println("You injured your hand trying to attack something");
                    player.setInjuredStatus(true);
                } else {
                    System.out.println("You injured your hand trying to attack " + item);
                    player.setInjuredStatus(true); 
                }
            } else if (word.equals("exit")) {
                exit = true;
                i = words.length;
            } else {
                System.out.println("I didn't quite understand that action, please try again");
                System.out.println("For a list of valid commands please type 'help' :");
                i = words.length;
            }
        }
    }
}
