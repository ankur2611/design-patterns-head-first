package src.com.design.patterns.strategy;

/**
 * Abstract Duck class for the Strategy design pattern.
 * This class defines the behaviors that all ducks must implement.
 */
public abstract class Duck {
    
    // FlyBehavior instance variable to hold the fly behavior of the duck
    FlyBehavior flyBehavior;
    
    // QuackBehavior instance variable to hold the quack behavior of the duck
    QuackBehavior quackBehavior;

    /**
     * Default constructor for Duck.
     */
    public Duck() {
    }

    /**
     * Sets the fly behavior for the duck.
     * 
     * @param fb the FlyBehavior to be set
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * Sets the quack behavior for the duck.
     * 
     * @param qb the QuackBehavior to be set
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    /**
     * Performs the fly action by invoking the fly behavior.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Performs the quack action by invoking the quack behavior.
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * Simulates the duck swimming.
     * Prints a message indicating that all ducks float.
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}