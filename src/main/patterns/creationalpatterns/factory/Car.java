package main.patterns.creationalpatterns.factory;

/**
 * This is a special {@link Vehicle} that represent an car.
 * 
 * @author                              o.le
 * @version                             1.0.01
 * @since                               0.1.1
 */
class Car implements Vehicle {

    private int drivenDistance;

    @Override
    public int drive(int distance) {
        
        return this.drivenDistance += distance;
    }
}
