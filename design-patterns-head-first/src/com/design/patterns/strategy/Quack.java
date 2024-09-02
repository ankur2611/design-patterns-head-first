package src.com.design.patterns.strategy;

/**
 * Quack class implements the QuackBehavior interface.
 * This class is used for ducks that quack.
 */
public class Quack implements QuackBehavior {

    /**
     * Overrides the quack method to indicate that the duck is quacking.
     * Prints a message stating "Quack".
     */
    public void quack() {
        System.out.println("Quack");
    }
}