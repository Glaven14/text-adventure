package edu.grinnell.csc207.compression;


/**
 * 
 */
public abstract class Items {
    protected String description;
    private boolean canPickUp;
    private boolean canTalkTo;
    private boolean canUse;


    /**
     * @param description
     * @param canPickUp
     * @param canTalkTo
     * @param canUse
     */
    public Items(String description, boolean canPickUp, boolean canTalkTo, boolean canUse) {
        this.description = description;
        this.canPickUp = canPickUp;
        this.canTalkTo = canTalkTo;
        this.canUse = canUse;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return if item can be picked up
     */
    public boolean getPickUp() {
        return canPickUp;
    }

    /**
     * @return if item is a person that can be talked to 
     */
    public boolean getTalkTo() {
        return canTalkTo;
    }

    /**
     * @return if item can be used
     */
    public boolean getUse() {
        return canUse;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return getIntroduction(); //+ " :" + getDescription();
    }

    /**
     * @param other
     * @return true iff this has the same name as other
     */
    public boolean equals(Items other) {
        if (this.getName().equals(other.getName())) {
            return true;
        }
        return false;
    }

    /**
     * @return name
     */
    public abstract String getName();

    /**
     * @param item
     * @param time
     * @return item based on string
     */
    public static Items isItem(String item, int time) {
        switch (item) {
            case "batbag":
                return new Batbag();
            case "cagemaster":
                return new CageMaster();
            case "clock":
                return new Clock(time);
            case "coach":
                return new Coach();
            case "food":
                return new Food("food");
            case "hallway":
                return new Hallway();
            case "pcard":
                return new Pcard();
            case "teammates":
                return new Teammates(time);
            case "uniform":
                return new Uniform();
            default:
                return null;
        }
    }

    /**
     * 
     */
    protected abstract void printMessage(); //either "message" or "cannot talk to"

    /**
     * 
     */
    protected abstract void use();

    /**
     * @return introductary name
     */
    protected abstract String getIntroduction();

}