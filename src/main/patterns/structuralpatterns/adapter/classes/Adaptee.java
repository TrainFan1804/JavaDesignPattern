package main.patterns.structuralpatterns.adapter.classes;

/**
 * The class that can is used as a {@link Target} without beeing a subtype of
 * this class.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.6
 */
class Adaptee {

    /**
     * Do something else.
     */
    void doSomethingElse() {
        
        System.out.println("Do something else");
    }
}
