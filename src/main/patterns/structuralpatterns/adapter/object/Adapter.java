package main.patterns.structuralpatterns.adapter.object;

/**
 * The adapter pattern allow the client to use a interface as another interface.
 * In this example the {@link Client} owns a {@link Target} type that is used
 * as a {@link Adaptee} type.
 * <p>
 * This package provide a example of the <b>Object</b> adpater. This adapter
 * use saved object from {@link Adaptee} to navigate the controll flow.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Adapter_pattern.
 * 
 * @author                              o.le
 * @version                             1.6
 * @since                               0.1
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void doSomething() {
            
        this.adaptee.doSomethingElse();
    }
}
