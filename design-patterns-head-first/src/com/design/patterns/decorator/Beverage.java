package src.com.design.patterns.decorator;

/**
 * Abstract class Beverage represents a beverage in the decorator pattern.
 * This class provides a base for all beverage types and includes methods
 * to get the description and size of the beverage, as well as an abstract
 * method to get the cost of the beverage.
 */
public abstract class Beverage {

    // Description of the beverage
    String description = "Unknown Beverage";
    // Size of the beverage
    String size = "Unknown Size";
    
    // Constants for beverage sizes
    public static String TALL = "Tall"; // small
    public static String GRANDE = "Grande"; // medium
    public static String VENTI = "Venti"; // large

    /**
     * Gets the description of the beverage.
     * 
     * @return the description of the beverage
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the size of the beverage.
     * 
     * @param size the size of the beverage
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets the size of the beverage.
     * 
     * @return the size of the beverage
     */
    public String getSize() {
        return size;
    }

    /**
     * Abstract method to get the cost of the beverage.
     * This method must be implemented by subclasses.
     * 
     * @return the cost of the beverage
     */
    public abstract double cost();
}