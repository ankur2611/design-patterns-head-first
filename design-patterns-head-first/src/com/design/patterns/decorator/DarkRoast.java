package src.com.design.patterns.decorator;

/**
 * DarkRoast class extends the Beverage class.
 * This class represents a specific type of beverage, a dark roast coffee.
 */
public class DarkRoast extends Beverage {

    /**
     * Constructor for DarkRoast.
     * Sets the description and size of the dark roast coffee.
     * 
     * @param size the size of the dark roast coffee
     */
    public DarkRoast(String size) {
        description = "Dark Roast Coffee";
        this.size = size;
    }

    /**
     * Gets the cost of the dark roast coffee.
     * 
     * @return the cost of the dark roast coffee
     */
    public double cost() {
        return .99;
    }
}