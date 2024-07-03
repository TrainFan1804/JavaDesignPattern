package main.patterns.structuralpatterns.facade;

// custom import
import main.patterns.structuralpatterns.facade.subsystem.Facade;

/**
 * This type represent the client that use a {@link Facade} to interact with an
 * subsystem.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.11
 */
class Client {

    private Facade facade = new Facade();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.facade.doSomething();
    }
}
