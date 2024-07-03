package main.patterns.behavioralpatterns.template;

/**
 * The template pattern provide an abstract class with an template method.
 * This method calls other abstract methods which are defined in subclasses.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Template_method_pattern.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.14
 */
public abstract class Template {

    /**
     * This is the template method that call other methods.
     */
    void templateMethod() {

        this.doSomething();
        this.doSomethingElse();
    }

    /**
     * Do something.
     */
    protected abstract void doSomething();

    /**
     * Do something else.
     */
    protected abstract void doSomethingElse();
}
