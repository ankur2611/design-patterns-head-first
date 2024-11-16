package src.com.design.patterns.command;

/**
 * RemoteControl class represents a remote control with multiple slots for commands.
 * This class allows setting commands for each slot and executing them.
 */
public class RemoteControl {

    // Arrays to hold the on and off commands for each slot
    Command[] onCommands;
    Command[] offCommands;

    /**
     * Constructor for RemoteControl.
     * Initializes the command arrays and sets default commands to NoCommand.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * Sets the on and off commands for a specific slot.
     * 
     * @param slot the slot number
     * @param onCommand the command to be executed when the on button is pressed
     * @param offCommand the command to be executed when the off button is pressed
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * Executes the on command for a specific slot.
     * 
     * @param slot the slot number
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * Executes the off command for a specific slot.
     * 
     * @param slot the slot number
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * Returns a string representation of the remote control and its commands.
     * 
     * @return a string representation of the remote control
     */
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
