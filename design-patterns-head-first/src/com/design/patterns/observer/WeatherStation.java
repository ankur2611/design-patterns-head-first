package src.com.design.patterns.observer;

/**
 * WeatherStation class to test the WeatherData and display elements.
 * This class contains the main method to simulate weather data updates.
 */
public class WeatherStation {
    
    /**
     * Main method to run the WeatherStation simulation.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a WeatherData instance
        WeatherData weatherData = new WeatherData();
        
        // Create a CurrentConditionsDisplay instance and register it with the WeatherData
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // Uncomment the following lines to add more displays
        // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        currentDisplay.display();

        weatherData.setMeasurements(82, 70, 29.2f);
        currentDisplay.display();

        weatherData.setMeasurements(78, 90, 29.2f);
        currentDisplay.display();
    }
}