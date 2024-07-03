package main.patterns.structuralpatterns.decorator;

/**
 * A special decorator is also a {@link Decorator} but with one or more special
 * method to call.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.12
 */
class SpecialDecorator extends Decorator {

    @Override
    void doSomethingUnique() {

        System.out.println("The decorator do something unique");
    }
}
