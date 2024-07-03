package main.patterns.structuralpatterns.facade.subsystem;

/**
 * The facade pattern provide a interface for an subsystem. The facade will 
 * delegate the method calls to the specific classes in the subsystem.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Facade_pattern.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.1
 */
public class Facade {

    private SubsystemClassOne sOne = new SubsystemClassOne();
    private SubsystemClassTwo sTwo = new SubsystemClassTwo();

    public void doSomething() {
        
        this.sOne.doSomething();
        this.sTwo.doSomething();
    }
}
