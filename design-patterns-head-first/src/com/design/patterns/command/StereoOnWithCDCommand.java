package src.com.design.patterns.command;

/**
 * The StereoOnWithCDCommand class is a concrete implementation of the Command interface.
 * It encapsulates a sequence of operations to turn on the stereo, set it to CD mode,
 * and adjust the volume.
 */
public class StereoOnWithCDCommand implements Command {

    // Receiver object that performs the actual operations
    private Stereo stereo;

    /**
     * Constructor to initialize the StereoOnWithCDCommand with a specific Stereo receiver.
     * @param stereo The Stereo object on which the command will operate.
     */
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    /**
     * Executes the command by performing the following operations on the receiver:
     * - Turns the stereo on.
     * - Sets the stereo to CD mode.
     * - Adjusts the volume to 11.
     */
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
