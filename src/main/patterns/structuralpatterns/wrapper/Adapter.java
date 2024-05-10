package main.patterns.structuralpatterns.wrapper;

/**
 * Classes that allow the communication between incompatible interfaces
 * are calles <b>adapter</b>.
 * <p>
 * This pattern is also known as <b>wrapper</b>.
 * <p>
 * In this exapmle: This is the adapter that implements the {@link EntertainmentDevice}
 * type that provide a method to use an specific entertainment device.
 * This adapter alows to use the method from the interface on the 
 * {@link Smartphone} type.
 * 
 * @see EntertainmentDevice
 * @see Smartphone
 * 
 * @author                              o.le
 * @version                             1.2.0
 * @since                               0.1.0
 */
public class Adapter implements EntertainmentDevice {

    private Smartphone television;

    /**
     * Create an Adapter for the {@link Smartphone} type.
     */
    public Adapter() {

        this.television = new Smartphone();
    }

    @Override
    public void use() {
        
        television.watch();
    }
}
