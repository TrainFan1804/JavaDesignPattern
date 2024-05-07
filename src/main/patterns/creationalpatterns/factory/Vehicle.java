package main.patterns.creationalpatterns.factory;

/**
 * This is an vehicle interface that is implemented by all types
 * that should have the behaivior from an {@link Vehicle} type.
 * <p>
 * All vehicle are created by an subtype from the {@link Factory}
 * type.
 * 
 * @see Car
 * 
 * @author                              o.le
 * @version                             1.0.0
 * @since                               0.1.1
 */
interface Vehicle {

    /**
     * This method add a distance to the total distance that the vehicle
     * is already drove.
     *   
     * @param distance                  The distance that was driven.
     * @return                          The new total distance.
     */
    int drive(int distance);
}
