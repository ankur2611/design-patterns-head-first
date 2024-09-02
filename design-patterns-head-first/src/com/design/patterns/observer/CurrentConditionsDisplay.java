package src.com.design.patterns.observer;

/**
 * CurrentConditionsDisplay class implements the Observer and DisplayElement interfaces.
 * This class displays the current weather conditions.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    // Variables to hold the temperature and humidity values
    private float temperature;
    private float humidity;
    // Subject instance to hold the weather data
    // private Subject weatherData;
    
    /**
     * Constructor for CurrentConditionsDisplay.
     * Registers this display as an observer to the weather data.
     * 
     * @param weatherData the Subject instance to be observed
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        // this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    /**
     * Updates the temperature and humidity values and displays the current conditions.
     * 
     * @param temperature the updated temperature value
     * @param humidity the updated humidity value
     * @param pressure the updated pressure value (not used in this display)
     */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        // display();
    }
    
    /**
     * Displays the current weather conditions.
     * Prints the temperature and humidity values.
     */
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
