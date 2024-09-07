package src.com.design.patterns.decorator;

/**
 * StarbuzzCoffee class to test the Beverage and CondimentDecorator classes.
 * This class contains the main method to simulate creating and decorating beverages.
 */
public class StarbuzzCoffee {
    
    /**
     * Main method to run the StarbuzzCoffee simulation.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Create an Espresso beverage of size TALL
        Beverage beverage = new Espresso(Beverage.TALL);
        // Print the description and cost of the Espresso
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Create a DarkRoast beverage of size GRANDE
        Beverage beverage2 = new DarkRoast(Beverage.GRANDE);
        // Decorate the DarkRoast with two Mocha condiments and a Whip condiment
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        // Print the description and cost of the decorated DarkRoast
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Create a HouseBlend beverage of size VENTI
        Beverage beverage3 = new HouseBlend(Beverage.VENTI);
        // Decorate the HouseBlend with Soy, Mocha, and Whip condiments
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        // Print the description and cost of the decorated HouseBlend
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}