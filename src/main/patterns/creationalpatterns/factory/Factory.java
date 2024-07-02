package main.patterns.creationalpatterns.factory;

/**
 * An type that can create other object is called <b>Factory</b>.
 * <p>
 * For more information: https://en.wikipedia.org/wiki/Factory_method_pattern.
 *  
 * @author                              o.le
 * @version                             1.2
 * @since                               0.1
 */
public class Factory {

    /**
     * This method create an object from the type {@link Product}.
     * 
     * @return                          The product that is created by
     *                                  the factory.
     */
    Product createProduct() {

        return new Product();
    }
}
