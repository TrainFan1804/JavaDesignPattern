package main.patterns.behavioralpatterns.nullobject;

// java import
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * This type represent the client that use different {@link AbstractObject}.
 * 
 * @author                              o.le
 * @version                             1.1
 * @since                               0.5
 */
class Client {

    private List<AbstractObject> list = new LinkedList<>();

    /**
     * Create a new client.
     */
    private Client() {
        
        for (int i = 0; i < 10; i++) {

            this.list.add(new NullObject());
            this.list.add(new RealObject());
        }

        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        
        Client c = new Client();

        for (AbstractObject o : c.list) {
            
            o.doSomething();
        }
    }
}
