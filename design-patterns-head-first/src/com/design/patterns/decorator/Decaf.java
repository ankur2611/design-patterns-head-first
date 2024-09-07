package src.com.design.patterns.decorator;

/**
 * Decaf class extends the Beverage class.
 * This class represents a specific type of beverage, a decaffeinated coffee.
 */
public class Decaf extends Beverage {

    /**
     * Constructor for Decaf.
     * Sets the description and size of the decaf coffee.
     * 
     * @param size the size of the decaf coffee
     */
    public Decaf(String size) {
        description = "Decaf Coffee";
        this.size = size;
    }

    /**
     * Gets the cost of the decaf coffee.
     * 
     * @return the cost of the decaf coffee
     */
    public double cost() {
        return 1.05;
    }
}