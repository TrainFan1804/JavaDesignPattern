package behavioral.observer;

/**
 * This type represent the client.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.16
 */
class Client {

    private Subject subject = new Subject();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.subject.attach(new Observer());
        client.subject.notifyObserver();
    }
}
