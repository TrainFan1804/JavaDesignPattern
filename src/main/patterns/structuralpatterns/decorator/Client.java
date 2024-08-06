package main.patterns.structuralpatterns.decorator;

/**
 * This type represent the client that use a {@link Component}. The component 
 * can be a {@link ConcreteComponent} or a subtype of {@link Decorator}.
 * {@link Adapter}.
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.13
 */
class Client {

    private Component component;

    Client() {

        Component c = new ConcreteComponent();
        this.component = new ConcreteDecorator(c); 
    }

    public static void main(String[] args) {
        
        Client client = new Client();
        System.out.println(client.component.operation()); 
    }
}
