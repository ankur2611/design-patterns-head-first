package src.com.design.patterns.command;

/**
 * The Light class represents a receiver in the Command design pattern.
 * It contains the actual logic to turn the light on or off.
 */
public class Light {

    /**
     * Turns the light on.
     * This method simulates the action of turning on a light
     * and prints a message to the console.
     */
    public void on() {
        System.out.println("Light is On");
    }

    /**
     * Turns the light off.
     * This method simulates the action of turning off a light
     * and prints a message to the console.
     */
    public void off() {
        System.out.println("Light is Off");
    }
}
