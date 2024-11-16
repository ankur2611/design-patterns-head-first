package src.com.design.patterns.command;

/**
 * The RemoteControlTest class is a client class that demonstrates the Command design pattern in action.
 * It sets up the remote control, configures it with a command, and simulates a button press to execute the command.
 */
public class RemoteControlTest {

    /**
     * The main method serves as the entry point of the program.
     * It initializes the components and demonstrates the interaction between the invoker, command, and receiver.
     * 
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {

        // Create the invoker (SimpleRemoteControl)
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Create the receiver (Light)
        Light light = new Light();

        // Create the concrete command (LightOnCommand) and associate it with the receiver
        LightOnCommand lightOn = new LightOnCommand(light);

        // Set the command in the invoker
        remote.setCommand(lightOn);

        // Simulate button press to execute the command
        remote.buttonWasPressed();
    }
}
