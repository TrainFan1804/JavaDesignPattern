package main.patterns.structuralpatterns.decorator;

/**
 * A special decorator is also a {@link Decorator} but with one or more special
 * method to call.
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.12
 */
class ConcreteDecorator extends Decorator {

    ConcreteDecorator(Component component) {

        super(component);
    }

    @Override
    public String operation() {
       
        return this.component.operation() + ", with " + ConcreteDecorator.class.toString();
    }
}
