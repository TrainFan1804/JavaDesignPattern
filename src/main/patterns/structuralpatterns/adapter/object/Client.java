package main.patterns.structuralpatterns.adapter.object;

/**
 * This type represent the client.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.6
 */
class Client {

    public static void main(String[] args) {
        
        Target t = new Adapter();       // create a Adapter type
        t.doSomething();
    }
}
