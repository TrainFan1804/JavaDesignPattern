package main.patterns.structuralpatterns.adapter.classes;

/**
 * The adapter pattern allow the client to use a interface as another interface.
 * In this example the {@link Client} owns a {@link Target} type that is used
 * as a {@link Adaptee} type.
 * <p>
 * This package provide a example of the <b>Class</b> adpater. This adapter
 * use inheritance to navigate the controll flow.
 * <p>
 * For more information: https://en.wikipedia.org/wiki/Adapter_pattern.
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.6
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void doSomething() {
            
        super.doSomethingElse();
    }
}
