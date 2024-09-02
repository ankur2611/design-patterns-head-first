package src.com.design.patterns.strategy;

/**
 * QuackBehavior interface for the Strategy design pattern.
 * Classes that implement this interface will define specific quacking behaviors for ducks.
 */
public interface QuackBehavior {
    
    /**
     * Method to be implemented by classes to define the quacking behavior.
     */
    public void quack();
}