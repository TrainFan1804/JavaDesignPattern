package main.patterns.structuralpatterns.decorator;

// java import
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * This type represent the client that use a {@link Component}. The component 
 * can be a {@link SpecialComponent} or a subtype of {@link Decorator}.
 * {@link Adapter}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.13
 */
class Client {

    private List<Component> components;

    Client() {

        this.components = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            
            this.components.add(new SpecialComponent());
        }

        for (int i = 0; i < 5; i++) {
            
            this.components.add(new SpecialDecorator());
        }

        Collections.shuffle(this.components);
    }

    public static void main(String[] args) {
        
        Client client = new Client();

        for (Component c : client.components) {
            
            c.doSomething();

            if (c instanceof Decorator) {

                ((Decorator)c).doSomethingUnique();
            }
        }
    }
}
