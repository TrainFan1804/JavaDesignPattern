package main.patterns.creationalpatterns;

/**
 * An type that can only has one instance is called <b>Singleton>.
 * 
 * @author                              o.le
 * @version                             1.0.1
 * @since                               0.1.0
 */
public class Singleton {

    private static Singleton singleton;

    /**
     * Create an Singleton.
     */
    private Singleton() {}

    /**
     * Return the instance of the Singleton. When this type has no 
     * instance there will be created one instance of the singleton.
     * 
     * @return                          The instance of the singleton.
     */
    public static Singleton getInstace() {

        if (Singleton.singleton == null) {

            Singleton.singleton = new Singleton();
        }

        return Singleton.singleton;
    }
}
