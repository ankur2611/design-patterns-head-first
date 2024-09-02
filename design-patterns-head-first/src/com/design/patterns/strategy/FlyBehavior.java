package src.com.design.patterns.strategy;

/**
 * FlyBehavior interface for the Strategy design pattern.
 * Classes that implement this interface will define specific flying behaviors for ducks.
 */
public interface FlyBehavior {
    
    /**
     * Method to be implemented by classes to define the flying behavior.
     */
    public void fly();
}