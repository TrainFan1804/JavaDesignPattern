package creational.prototype;

/**
 * A type that has the ability to create a copy of itself is called a <b>Prototype</b>.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Prototype_pattern.
 * 
 * @author                              o.le
 * @version                             1.3
 * @since                               0.4
 */
public interface Prototype {

    /**
     * This method create an copy from the {@link Product} type.
     * 
     * @return                          The product that is copyed by
     *                                  the prototype.
     */
    Product clone();
}
