package src.com.design.patterns.strategy;

/**
 * MiniDuckSimulator class to test the Duck behaviors.
 * This class contains the main method to simulate duck behaviors.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Create a MallardDuck instance
        Duck mallard = new MallardDuck();
        // Perform quack and fly behaviors for the MallardDuck
        mallard.performQuack();
        mallard.performFly();

        // Create a ModelDuck instance
        Duck model = new ModelDuck();
        // Perform fly behavior for the ModelDuck (initially cannot fly)
        model.performFly();
        // Change the fly behavior of the ModelDuck to FlyRocketPowered
        model.setFlyBehavior(new FlyRocketPowered());
        // Perform fly behavior for the ModelDuck (now flies with a rocket)
        model.performFly();
    }
}