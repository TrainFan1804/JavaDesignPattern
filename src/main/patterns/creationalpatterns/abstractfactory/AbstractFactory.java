package main.patterns.creationalpatterns.abstractfactory;

/**
 * The <b>Abstract Factory</b> pattern allow to create objects from an
 * type family withour knowing the exact subtype from creating type.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Abstract_factory_pattern.
 * 
 * @author                              o.le
 * @version                             1.3
 * @since                               0.3
 */
public interface AbstractFactory {

    /**
     * This method create an object from the type {@link ProductA}.
     * 
     * @return                          The product that is created by
     *                                  the factory.
     */
    ProductA createProductA();

    /**
     * This method create an object from the type {@link ProductB}.
     * 
     * @return                          The product that is created by
     *                                  the factory.
     */
    ProductB createProductB();
}
