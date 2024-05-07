package main.patterns.creationalpatterns.factory;

/**
 * This is an factory interface that is implemented by all types that
 * should create an object that implements the {@link Vehicle}
 * type.
 * 
 * @see CarFactory
 *  
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.1.1
 */
interface VehicleFactory extends Factory {

    /**
     * This method create an object from the type {@link Vehicle}.
     * 
     * @return                          The vehicle that is created by
     *                                  the factory.
     */
    Vehicle createVehicle();
}
