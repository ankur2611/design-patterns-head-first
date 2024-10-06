package src.com.design.patterns.singleton;

/**
 * VolatileSingleton class implements the Singleton design pattern with double-checked locking.
 * This class ensures that only one instance of the class is created and provides a global point of access to it.
 * The instance is declared as volatile to ensure visibility of changes across threads.
 */
public class VolatileSingleton {
    
    // Volatile static instance of VolatileSingleton, initially null
    private volatile static VolatileSingleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private VolatileSingleton() {}

    /**
     * Provides the global point of access to the single instance of VolatileSingleton.
     * Uses double-checked locking to ensure thread safety and improve performance.
     * 
     * @return the single instance of VolatileSingleton
     */
    public static VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleton.class) {
                if (instance == null) {
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }
}
