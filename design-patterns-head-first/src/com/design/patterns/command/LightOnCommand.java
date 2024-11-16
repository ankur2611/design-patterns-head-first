package src.com.design.patterns.command;

/**
 * The LightOnCommand class is a concrete implementation of the Command interface.
 * It encapsulates the request to turn on the light by delegating the call to the receiver (Light object).
 */
public class LightOnCommand implements Command {

    // Receiver object that performs the actual operation
    private Light light;

    /**
     * Constructor to initialize the LightOnCommand with a specific Light receiver.
     * @param light The Light object on which the command will operate.
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * Executes the command by invoking the on() method on the receiver.
     * This method triggers the operation to turn on the light.
     */
    public void execute() {
        light.on();
    }
}
