package src.com.design.patterns.decorator;

/**
 * Whip class extends the CondimentDecorator class.
 * This class represents a specific type of condiment, whip, that can be added to a beverage.
 */
public class Whip extends CondimentDecorator {

    // Instance variable to hold the beverage that is being decorated
    Beverage beverage;

    /**
     * Constructor for Whip.
     * Sets the beverage that is being decorated.
     * 
     * @param beverage the beverage to be decorated with whip
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Gets the description of the beverage with whip.
     * 
     * @return the description of the beverage with whip
     */
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    /**
     * Gets the cost of the beverage with whip.
     * Adds the cost of whip to the cost of the beverage.
     * 
     * @return the cost of the beverage with whip
     */
    public double cost() {
        return .10 + beverage.cost();
    }
}