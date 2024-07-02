package main.patterns.structuralpatterns.adapter;

/**
 * The adapter pattern allow the client to use a interface as another interface.
 * In this example the {@link Client} owns a {@link Target} type that is used
 * as a {@link Adaptee} type.
 * <p>
 * For more information: https://en.wikipedia.org/wiki/Adapter_pattern.
 * 
 * @author                              o.le
 * @version                             1.4
 * @since                               0.1
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void doSomething() {
            
        this.adaptee.doSomethingElse();
    }
}
