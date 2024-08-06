package main.patterns.structuralpatterns.decorator;

/**
 * This type just provide the funtions from the supertype {@link Component}.
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.12
 */
class ConcreteComponent implements Component {

    @Override
    public String operation() {
    
        return ConcreteComponent.class.toString();
    }
}
