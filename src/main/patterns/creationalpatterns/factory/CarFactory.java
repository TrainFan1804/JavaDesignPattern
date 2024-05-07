package main.patterns.creationalpatterns.factory;

/**
 * This is a special {@link VehicleFactory} that create  an 
 * {@link Vehicle} from the {@link Car} type.
 * 
 * @author                              o.le
 * @version                             0.1.22
 * @since                               0.1.0
 */
class CarFactory implements VehicleFactory {

    private static CarFactory instance;

    private CarFactory() {}

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
