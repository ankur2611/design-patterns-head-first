package src.com.design.patterns.decorator;

/**
 * Soy class extends the CondimentDecorator class.
 * This class represents a specific type of condiment, soy, that can be added to a beverage.
 */
public class Soy extends CondimentDecorator {

    // Instance variable to hold the beverage that is being decorated
    Beverage beverage;

    /**
     * Constructor for Soy.
     * Sets the beverage that is being decorated.
     * 
     * @param beverage the beverage to be decorated with soy
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Gets the description of the beverage with soy.
     * 
     * @return the description of the beverage with soy
     */
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * Gets the cost of the beverage with soy.
     * Adds the cost of soy to the cost of the beverage.
     * 
     * @return the cost of the beverage with soy
     */
    public double cost() {
        return .15 + beverage.cost();
    }
}