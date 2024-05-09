package main.patterns.creationalpatterns.builder;

/**
 * An type that can create parts of other object are called <b>Builder</b>.
 * <p>
 * In this exapmle: This is an builder interface that is implemented
 * by all types that should create parts of object's there are implements
 * the {@link Product} type.
 * 
 * @see PizzaBuilder
 * 
 * @author                              o.le
 * @version                             1.0.3
 * @since                               0.4.2
 */
public interface Builder {
    
    /**
     * This method create an object from the type {@link Product}.
     * 
     * @return                          The product that is created by
     *                                  the builder.
     */
    Product build();
}
