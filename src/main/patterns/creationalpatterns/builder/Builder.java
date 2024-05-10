package main.patterns.creationalpatterns.builder;

/**
 * An type that can create parts of other object are called <b>Builder</b>.
 * <p>
 * In this exapmle: This is an builder interface that is implemented
 * by all types that should create parts of object's there are implements
 * the {@link Pizza} type.
 * 
 * @see EverythingPizzaBuilder
 * 
 * @author                              o.le
 * @version                             1.3.3
 * @since                               0.4.2
 */
public interface Builder {
    
    /**
     * This method create an object from the type {@link Pizza}.
     * 
     * @return                          The product that is created by
     *                                  the builder.
     */
    Pizza build();

    /**
     * Set the cheese field of the builder. The cheese that is 
     * set is also the cheese of the created pizza.
     * 
     * @param cheese                    The cheese of the wanted pizza.
     * @return                          The same builder instance 
     *                                  that call this function.                                 
     */
    Builder setCheese(boolean cheese);

    /**
     * Set the meat field of the builder. The meat that is 
     * set is also the meat of the created pizza.
     * 
     * @param meat                      The meat of the wanted pizza.
     * @return                          The same builder instance 
     *                                  that call this function.                                 
     */
    Builder setMeat(boolean meat);

    /**
     * Set the vegetables field of the builder. The vegetables 
     * that is set is also the vegetables of the created pizza.
     * 
     * @param vegetables                The vegetables of the wanted pizza.
     * @return                          The same builder instance 
     *                                  that call this function.                                 
     */
    Builder setVegetables(boolean vegetables);
}
