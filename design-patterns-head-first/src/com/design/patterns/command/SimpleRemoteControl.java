package src.com.design.patterns.command;

/**
 * The SimpleRemoteControl class acts as the invoker in the Command design pattern.
 * It holds a reference to a command and allows the client to execute the command
 * through a button press simulation.
 */
public class SimpleRemoteControl {

    // A slot to hold a single command; this represents the button functionality
    private Command slot;

    /**
     * Default constructor for SimpleRemoteControl.
     * Initializes the remote control without any command.
     */
    public SimpleRemoteControl() {}

    /**
     * Sets the command that the remote control will execute.
     * 
     * @param command The command to be set in the remote control.
     */
    public void setCommand(Command command) {
        slot = command;
    }

    /**
     * Simulates pressing the button on the remote control.
     * This method triggers the execution of the currently set command.
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
