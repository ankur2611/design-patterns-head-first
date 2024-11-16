package src.com.design.patterns.command;

/**
 * The Stereo class represents a receiver in the Command design pattern.
 * It contains the actual logic to control a stereo system, including turning it on/off,
 * setting the CD, and adjusting the volume.
 */
public class Stereo {

    /**
     * Turns the stereo on.
     * This method simulates powering on the stereo and prints a message to the console.
     */
    public void on() {
        System.out.println("Stereo is On");
    }

    /**
     * Turns the stereo off.
     * This method simulates powering off the stereo and prints a message to the console.
     */
    public void off() {
        System.out.println("Stereo is Off");
    }

    /**
     * Sets the stereo to CD mode.
     * This method simulates inserting a CD and prints a message to the console.
     */
    public void setCD() {
        System.out.println("CD is Set");
    }

    /**
     * Adjusts the stereo volume.
     * This method simulates setting the volume to a specified level and prints the level to the console.
     *
     * @param volume The desired volume level to be set.
     */
    public void setVolume(int volume) {
        System.out.println("Volume is set to " + volume);
    }
}
