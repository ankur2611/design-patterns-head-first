package src.com.design.patterns.strategy;

/**
 * ModelDuck class extends the Duck class.
 * This class represents a specific type of duck, a model duck.
 */
public class ModelDuck extends Duck {

    /**
     * Constructor for ModelDuck.
     * Sets the fly behavior to FlyNoWay and the quack behavior to Quack.
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    /**
     * Displays the type of duck.
     * Prints a message stating "I'm a model duck".
     */
    public void display() {
        System.out.println("I'm a model duck");
    }
}