package src.com.design.patterns.strategy;

/**
 * FlyWithWings class implements the FlyBehavior interface.
 * This class is used for ducks that fly with wings.
 */
public class FlyWithWings implements FlyBehavior {

    /**
     * Overrides the fly method to indicate that the duck is flying with wings.
     * Prints a message stating "I'm flying!!".
     */
    public void fly() {
        System.out.println("I'm flying!!");
    }
}