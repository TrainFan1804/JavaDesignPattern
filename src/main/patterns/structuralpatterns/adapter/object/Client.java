package main.patterns.structuralpatterns.adapter.object;

/**
 * This type represent the client that use a {@link Target}. The target is an
 * {@link Adapter}.
 * 
 * @author                              o.le
 * @version                             0.7
 * @since                               0.6
 */
class Client {

    private Target t = new Adapter();   // create a Adapter type

    public static void main(String[] args) {
        
        Client c = new Client();
        c.t.doSomething();
    }
}
