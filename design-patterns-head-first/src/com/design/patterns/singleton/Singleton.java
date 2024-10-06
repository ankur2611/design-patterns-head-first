package src.com.design.patterns.singleton;

/**
 * Singleton class implements the Singleton design pattern.
 * This class ensures that only one instance of the class is created and provides a global point of access to it.
 */
public class Singleton {
    
    // Static instance of Singleton, initially null
    private static Singleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private Singleton() {}

    /**
     * Provides the global point of access to the single instance of Singleton.
     * If the instance is null, it creates a new instance.
     * 
     * @return the single instance of Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
