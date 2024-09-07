package src.com.design.patterns.decorator;

/**
 * HouseBlend class extends the Beverage class.
 * This class represents a specific type of beverage, a house blend coffee.
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor for HouseBlend.
     * Sets the description and size of the house blend coffee.
     * 
     * @param size the size of the house blend coffee
     */
    public HouseBlend(String size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    /**
     * Gets the cost of the house blend coffee.
     * 
     * @return the cost of the house blend coffee
     */
    public double cost() {
        return .89;
    }
}