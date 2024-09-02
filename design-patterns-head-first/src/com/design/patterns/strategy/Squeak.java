package src.com.design.patterns.strategy;

/**
 * Squeak class implements the QuackBehavior interface.
 * This class is used for ducks that squeak.
 */
public class Squeak implements QuackBehavior {

    /**
     * Overrides the quack method to indicate that the duck is squeaking.
     * Prints a message stating "Squeak".
     */
    public void quack() {
        System.out.println("Squeak");
    }
}