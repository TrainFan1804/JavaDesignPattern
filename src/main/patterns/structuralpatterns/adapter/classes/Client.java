package main.patterns.structuralpatterns.adapter.classes;

/**
 * This type represent the client.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.6
 */
class Client {

    public static void main(String[] args) {
        
        Target t = new Adapter();       // create a Adapter type
        t.doSomething();
    }
}
