package main.patterns.structuralpatterns.wrapper;

/**
 * This is an device interface that is implemented by all types
 * that should have the behaivior from an {@link EntertainmentDevicehicle}
 * type.
 * <p>
 * This is an functional interface.
 * 
 * @see Adapter
 * 
 * @author                              o.le
 * @version                             1.0.1
 * @since                               0.5.1
 */
interface EntertainmentDevice {

    /**
     * Use this entertainment device.
     */
    void use();
}
