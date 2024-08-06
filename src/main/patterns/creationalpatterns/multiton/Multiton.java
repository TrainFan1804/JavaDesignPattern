package main.patterns.creationalpatterns.multiton;

// java import
import java.util.HashMap;

public class Multiton {

    private static HashMap<Object, Multiton> multiton = new HashMap<>();

   private Multiton() {}

   public static Multiton getInstace(Object key) {

        Multiton instance = Multiton.multiton.get(key);

        if (instance == null) {

            instance = new Multiton();
            Multiton.multiton.put(key, instance);
        }

        return instance;
    }
}
