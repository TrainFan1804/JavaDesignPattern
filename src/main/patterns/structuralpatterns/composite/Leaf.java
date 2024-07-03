package main.patterns.structuralpatterns.composite;

/**
 * A leaf represent the last type of the hierachie.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.12
 */
class Leaf implements Component {

    @Override
    public void doSomething() {
     
        System.out.println("The leaf do something");
    }
}
