package main.patterns.creationalpatterns.factory;

// custom import
import main.patterns.creationalpatterns.Singleton;

/**
 * This is an factory interface that is implemented by all types that
 * should create an object that implements the {@link Vehicle}
 * type.
 * <p>
 * All factorys should use the {@link Singleton} pattern.
 * 
 * @see CarFactory
 *  
 * @author                              o.le
 * @version                             1.0.0
 * @since                               0.1.1
 */
interface VehicleFactory {

    /**
     * This method create an object from the type {@link Vehicle}.
     * 
     * @return                          The vehicle that is created by
     *                                  the factory.
     */
    Vehicle createVehicle();
}
