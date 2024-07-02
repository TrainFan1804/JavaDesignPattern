package main.patterns.behavioralpatterns.nullobject;

// java import
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * This type represent the client that use different {@link AbstractObject}.
 * 
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.5.9
 */
class Client {

    private List<AbstractObject> list;

    /**
     * Create a new client.
     */
    private Client() {
        
        this.list = new LinkedList<>();
        
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
