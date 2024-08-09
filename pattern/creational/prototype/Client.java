package creational.prototype;

/**
 * This type represent the client.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.7
 */
class Client {

    private Product product;

    /**
     * Create a new client.
     */
    private Client(int x) {

        this.product = new Product(x);
    }

    public static void main(String[] args) {
     
        Client c = new Client(5);
        Product p1 = c.product;
        Product p2 = p1.clone();

        // p1 and p2 are two different objects
        System.out.println(p1.equals(p2));
    }
}
