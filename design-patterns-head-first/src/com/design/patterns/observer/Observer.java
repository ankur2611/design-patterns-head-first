package src.com.design.patterns.observer;

/**
 * Observer interface for the Observer design pattern.
 * Classes that implement this interface will be notified of changes
 * in the subject they are observing.
 */
public interface Observer {
    
    /**
     * This method is called whenever the observed object is changed.
     * 
     * @param temperature the updated temperature value
     * @param humidity the updated humidity value
     * @param pressure the updated pressure value
     */
    public void update(float temperature, float humidity, float pressure);
}