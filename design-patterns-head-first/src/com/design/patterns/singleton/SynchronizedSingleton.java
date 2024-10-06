package src.com.design.patterns.singleton;

/**
 * SynchronizedSingleton class implements the Singleton design pattern with thread safety.
 * This class ensures that only one instance of the class is created and provides a global point of access to it.
 * The getInstance method is synchronized to make it thread-safe.
 */
public class SynchronizedSingleton {
    
    // Static instance of SynchronizedSingleton, initially null
    private static SynchronizedSingleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private SynchronizedSingleton() {}

    /**
     * Provides the global point of access to the single instance of SynchronizedSingleton.
     * The method is synchronized to ensure thread safety.
     * If the instance is null, it creates a new instance.
     * 
     * @return the single instance of SynchronizedSingleton
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
