package main.patterns.creationalpatterns.factory;

// custom import
import main.patterns.creationalpatterns.Singleton;

/**
 * An type that can create other object is called <b>Factory</b>.
 * <p>
 * All factorys should use the {@link Singleton} pattern.
 * <p>
 * In this exapmle: This is an factory interface that is implemented
 * by all types that should create an object that implements the
 * {@link Vehicle} type.
 * 
 * @see CarFactory
 *  
 * @author                              o.le
 * @version                             1.1.2
 * @since                               0.1.1
 */
public interface Factory {

    /**
     * This method create an object from the type {@link Vehicle}.
     * 
     * @return                          The vehicle that is created by
     *                                  the factory.
     */
    Vehicle createVehicle();
}
