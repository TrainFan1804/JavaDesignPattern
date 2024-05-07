package main.patterns.creationalpatterns.factory;

/**
 * This is a special {@link Vehicle} that represent an car.
 * <p>
 * This type is created by an {@link CarFactory}.
 * 
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.1.1
 */
class Car implements Vehicle {

    private int drivenDistance;

    @Override
    public int drive(int distance) {
        
        return this.drivenDistance += distance;
    }
}
