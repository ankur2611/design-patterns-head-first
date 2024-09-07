package src.com.design.patterns.decorator;

/**
 * Mocha class extends the CondimentDecorator class.
 * This class represents a specific type of condiment, mocha, that can be added to a beverage.
 */
public class Mocha extends CondimentDecorator {

    // Instance variable to hold the beverage that is being decorated
    Beverage beverage;

    /**
     * Constructor for Mocha.
     * Sets the beverage that is being decorated.
     * 
     * @param beverage the beverage to be decorated with mocha
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Gets the description of the beverage with mocha.
     * 
     * @return the description of the beverage with mocha
     */
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * Gets the size of the beverage.
     * 
     * @return the size of the beverage
     */
    public String getSize() {
        return beverage.getSize();
    }

    /**
     * Gets the cost of the beverage with mocha.
     * Adds the cost of mocha to the cost of the beverage.
     * Adjusts the cost based on the size of the beverage.
     * 
     * @return the cost of the beverage with mocha
     */
    public double cost() {
        // Base cost of mocha
        double cost = .20 + beverage.cost();
        // Get the size of the beverage
        String size = getSize();

        // Adjust the cost based on the size of the beverage
        if (size.equals(Beverage.TALL)) {
            return .10 + cost;
        } else if (size.equals(Beverage.GRANDE)) {
            return .15 + cost;
        } else if (size.equals(Beverage.VENTI)) {
            return .20 + cost;
        }
        return cost;
    }
}