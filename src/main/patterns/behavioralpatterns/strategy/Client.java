package main.patterns.behavioralpatterns.strategy;

/**
 * This type represent the client that use a {@link Target}. The target is an
 * {@link Adapter}.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.19
 */
class Client {

    Context context = new Context();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.context.operation();
    }
}
