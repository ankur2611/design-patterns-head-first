package src.com.design.patterns.strategy;

/**
 * MuteQuack class implements the QuackBehavior interface.
 * This class is used for ducks that do not make any sound.
 */
public class MuteQuack implements QuackBehavior {

    /**
     * Overrides the quack method to indicate that the duck is silent.
     * Prints a message stating "<< Silence >>".
     */
    public void quack() {
        System.out.println("<< Silence >>");
    }
}