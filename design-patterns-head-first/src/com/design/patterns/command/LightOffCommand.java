package src.com.design.patterns.command;

/**
 * The LightOffCommand class is a concrete implementation of the Command interface.
 * It encapsulates the request to turn off the light by delegating the call to the receiver (Light object).
 */
public class LightOffCommand implements Command {
    
    // Receiver object that performs the actual operation
    private Light light;

    /**
     * Constructor to initialize the LightOffCommand with a specific Light receiver.
     * @param light The Light object on which the command will operate.
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * Executes the command by invoking the off() method on the receiver.
     * This method triggers the operation to turn off the light.
     */
    public void execute() {
        light.off();
    }
}
