package src.com.design.patterns.singleton;

/**
 * EagerSingleton class implements the Singleton design pattern.
 * This class ensures that only one instance of the class is created and provides a global point of access to it.
 */
public class EagerSingleton {
    
    // Static instance of EagerSingleton created eagerly at class loading time
    private static EagerSingleton instance = new EagerSingleton();
    
    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private EagerSingleton() {}

    /**
     * Provides the global point of access to the single instance of EagerSingleton.
     * 
     * @return the single instance of EagerSingleton
     */
    public EagerSingleton getInstance() {
        return instance;
    }
}
