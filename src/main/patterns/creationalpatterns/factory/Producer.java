package main.patterns.creationalpatterns.factory;

/**
 * This type represent the producer that use the {@link Factory}.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.7
 */
class Producer {

    private Factory factory = new Factory();
    
    public static void main(String[] args) {
    
        Producer producer = new Producer();
        producer.factory.createProduct();
    }
}
