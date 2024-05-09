package main.patterns.creationalpatterns.prototype;

/**
 * An type that can create a copy of an object is called <b>Prototype</b>.
 * <p>
 * In this exapmle: This is an prototype interface that is implemented
 * by all {@link Animal} types that should create an copy of themself.
 * 
 * @see Cat
 * 
 * @author                              o.le
 * @version                             1.0.3
 * @since                               0.4.6
 */
public interface Prototype {

    /**
     * This method create an copy from the {@link Animal} type.
     * 
     * @return                          The animal that is copyed by
     *                                  the prototype.
     */
    Animal clone();
}
