package src.com.design.patterns.observer;

/**
 * Subject interface for the Observer design pattern.
 * Classes that implement this interface allow observers to register,
 * remove themselves, and be notified of changes.
 */
public interface Subject {

    /** 
     * Registers an observer to the subject.
     * 
     * @param observer the observer that is to be registered
     */
    public void registerObserver(Observer observer);

    /** 
     * Removes an observer from the subject.
     * 
     * @param observer the observer that is to be removed
     */
    public void removeObserver(Observer observer);

    /** 
     * Notifies all registered observers of a change.
     */
    public void notifyObservers();
}