package main.patterns.behavioralpatterns.state;

/**
 * This type represent the client that use a {@link Context}.
 * 
 * @author                              o.le
 * @version                             0.1
 * @since                               0.15
 */
class Client {

    private Context context = new Context();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.context.setState(new StateA());
        client.context.request();
        client.context.setState(new StateB());
        client.context.request();
    }
}
