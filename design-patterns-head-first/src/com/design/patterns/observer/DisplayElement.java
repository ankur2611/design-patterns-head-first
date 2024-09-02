package src.com.design.patterns.observer;

/**
 * DisplayElement interface for the Observer design pattern.
 * Classes that implement this interface will display the state of the subject.
 */
public interface DisplayElement {
    
    /**
     * Displays the current state of the subject.
     */
    public void display();
}