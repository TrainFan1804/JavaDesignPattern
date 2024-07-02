package main.patterns.creationalpatterns.abstractfactory;

/**
 * This type represent the client that use the {@link AbstractFactory}.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.8
 */
class Client {

    private AbstractFactory abstractFactory = new Factory1();

    public static void main(String[] args) {
        
        Client c = new Client();
        c.abstractFactory.createProductA();
        c.abstractFactory.createProductB();
    }
}
