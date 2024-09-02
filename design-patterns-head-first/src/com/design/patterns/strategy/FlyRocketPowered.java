package src.com.design.patterns.strategy;

/**
 * FlyRocketPowered class implements the FlyBehavior interface.
 * This class is used for ducks that fly with a rocket.
 */
public class FlyRocketPowered implements FlyBehavior {

    /**
     * Overrides the fly method to indicate that the duck is flying with a rocket.
     * Prints a message stating "I'm flying with a rocket!".
     */
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}