package main.patterns.structuralpatterns.proxy;

/**
 * This type represent the client that use a {@link Subject}.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.11
 */
class Client {

    private Subject subject = new Proxy();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.subject.operation();
    }
}
