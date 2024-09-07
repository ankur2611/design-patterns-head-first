package src.com.design.patterns.decorator;

/**
 * Espresso class extends the Beverage class.
 * This class represents a specific type of beverage, an espresso.
 */
public class Espresso extends Beverage {

    /**
     * Constructor for Espresso.
     * Sets the description and size of the espresso.
     * 
     * @param size the size of the espresso
     */
    public Espresso(String size) {
        description = "Espresso";
        this.size = size;
    }

    /**
     * Gets the cost of the espresso.
     * 
     * @return the cost of the espresso
     */
    public double cost() {
        return 1.99;
    }
}