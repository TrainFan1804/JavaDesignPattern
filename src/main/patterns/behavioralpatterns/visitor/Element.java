package main.patterns.behavioralpatterns.visitor;

/**
 * The element that the user want to extend with functionality. This class
 * is inside the old system that want to be expanded.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.17
 */
abstract class Element {

    int x = 5;
    String name = "Element";

    /**
     * Accept a visitor to add more functionality.
     * 
     * @param visitor                   The new visitor.
     */
    abstract void accept(Visitor visitor);
}
