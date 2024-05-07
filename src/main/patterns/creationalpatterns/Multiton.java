package main.patterns.creationalpatterns;

// java import
import java.util.HashMap;

/**
 * An type that can have multiple instances is called <b>Multiton</b>.
 * <p>
 * All instances of the multion can be access with an unique key.
 * 
 * @author                              o.le
 * @version                             1.0.1
 * @since                               0.1
 */
public class Multiton {

    private static HashMap<Object, Multiton> multiton = new HashMap<>();

    /**
     * Create an Multiton.
     */
    private Multiton() {}

    /**
     * Return the instance of the multiton. When the given key isn't
     * associate with an instance there will be created an instance
     * of the multiton that is associated with the given key.
     * 
     * @param key                       The key value of the wanted
     *                                  multiton instance.
     * @return                          The instance of the multiton.
     */
    public static Multiton getInstace(Object key) {

        Multiton instance = Multiton.multiton.get(key);

        if (instance == null) {

            instance = new Multiton();
            Multiton.multiton.put(key, instance);
        }

        return instance;
    }
}
