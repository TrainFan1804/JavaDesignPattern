package main.patterns.structuralpatterns.decorator;

/**
 * This type just provide the funtions from the supertype {@link Component}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.12
 */
class ComponentOne implements Component {

    @Override
    public void doSomething() {
     
        System.out.println("This component is just a normal component.");
    }
}
