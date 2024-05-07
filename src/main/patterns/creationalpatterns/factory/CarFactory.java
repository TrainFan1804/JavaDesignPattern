package main.patterns.creationalpatterns.factory;

/**
 * This is a special {@link VehicleFactory} that create  an 
 * {@link Vehicle} from the {@link Car} type.
 * 
 * @author                              o.le
 * @version                             1.0.01
 * @since                               0.1.0
 */
class CarFactory implements VehicleFactory {

    private static CarFactory instance;

    /**
     * Create an CarFactory.
     */
    private CarFactory() {}

    /**
     * Return the instance of the CarFactory. When the car factory has
     * no instance there will be created one instance of the factory.
     * 
     * @return                          The instance of the car factory.
     */
    public static CarFactory getInstace() {

        if (CarFactory.instance == null) {

            CarFactory.instance = new CarFactory();
        }

        return CarFactory.instance;
    }

    /**
     * This method create an object from the type {@link Car}.
     * 
     * @return                          The vehicle that is created by
     *                                  the factory.
     */
    @Override
    public Vehicle createVehicle() {
        
        return new Car();
    }
}
