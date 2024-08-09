package structural.flyweight;

/**
 * This type represent the client that use a {@link Flyweight}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.10
 */
class Client {

    private Flyweight flyweight;

    private Client(int x) {

        this.flyweight = new FlyweightOne(x);
    }

    public static void main(String[] args) {
        
        Client client = new Client(2);
        client.flyweight.share();
    }
}
