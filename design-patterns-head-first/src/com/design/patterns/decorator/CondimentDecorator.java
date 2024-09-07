package src.com.design.patterns.decorator;

/**
 * Abstract class CondimentDecorator extends the Beverage class.
 * This class serves as a base for all condiment decorators.
 * It requires subclasses to implement the getDescription method.
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * Abstract method to get the description of the beverage with the condiment.
     * This method must be implemented by subclasses.
     * 
     * @return the description of the beverage with the condiment
     */
    public abstract String getDescription();
}