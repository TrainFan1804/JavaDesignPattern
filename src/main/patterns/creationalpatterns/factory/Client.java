package main.patterns.creationalpatterns.factory;

/**
 * This type represent the client that use the {@link Factory}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.7
 */
class Client {

    public static void main(String[] args) {
        
        Factory f = new Factory();
        
        Product p = f.createProduct();
    }
}
