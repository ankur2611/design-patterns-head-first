package src.com.design.patterns.strategy;

/**
 * FlyNoWay class implements the FlyBehavior interface.
 * This class is used for ducks that cannot fly.
 */
public class FlyNoWay implements FlyBehavior {

    /**
     * Overrides the fly method to indicate that the duck cannot fly.
     * Prints a message stating "I can't fly".
     */
    public void fly() {
        System.out.println("I can't fly");
    }
}