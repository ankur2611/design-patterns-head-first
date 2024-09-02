package src.com.design.patterns.strategy;

/**
 * MallardDuck class extends the Duck class.
 * This class represents a specific type of duck, a Mallard duck.
 */
public class MallardDuck extends Duck {

    /**
     * Constructor for MallardDuck.
     * Sets the fly behavior to FlyWithWings and the quack behavior to Quack.
     */
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * Displays the type of duck.
     * Prints a message stating "I'm a real Mallard duck".
     */
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}