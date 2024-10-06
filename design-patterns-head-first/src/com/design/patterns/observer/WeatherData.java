package src.com.design.patterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    
    // ArrayList to hold all registered observers
    private ArrayList<Observer> observers;
    // Variables to hold the weather data
    private float temperature;
    private float humidity;
    private float pressure;
    
    /**
     * Constructor for WeatherData.
     * Initializes the observers list.
     */
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Registers an observer to the observers list.
     * 
     * @param observer the observer to be registered
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the observers list.
     * 
     * @param observer the observer to be removed
     */
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * Notifies all registered observers of a change in weather data.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Called when the measurements have been updated.
     * Notifies all observers of the change.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Sets the weather measurements and notifies observers of the change.
     * 
     * @param temperature the new temperature value
     * @param humidity the new humidity value
     * @param pressure the new pressure value
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}