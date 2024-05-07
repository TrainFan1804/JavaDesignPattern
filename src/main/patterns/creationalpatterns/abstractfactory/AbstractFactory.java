package main.patterns.creationalpatterns.abstractfactory;

/**
 * The <b>Abstract Factory</b> pattern allow to create objects from an
 * type family withour knowing the exact subtype from creating type.
 * <p>
 * All factorys should use the {@link Singleton} pattern.
 * <p>
 * In this exapmle: This is an factory interface that is implemented
 * by all types that should create an object that implements the 
 * {@link Chair} or {@link Table} type.
 * 
 * @author                              o.le
 * @version                             1.1.0
 * @since                               0.3.5
 */
public interface AbstractFactory {

    /**
     * This method create an object from the type {@link Chair}.
     * 
     * @return                          The chair that is created by
     *                                  the factory.
     */
    Chair createChair();

    /**
     * This method create an object from the type {@link Table}.
     * 
     * @return                          The table that is created by
     *                                  the factory.
     */
    Table createTable();
}
