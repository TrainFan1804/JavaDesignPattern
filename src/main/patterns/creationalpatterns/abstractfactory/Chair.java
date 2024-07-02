package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is an chair interface that is implemented by all types
 * that should have the behaivior from an {@link Chair} type.
 * <p>
 * All chair are created by an subtype from the {@link AbstractFactory}
 * type.
 * <p>
 * This is an functional interface.
 * 
 * @see ModernChair
 * @see OldChair
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.3
 */
interface Chair {

    /**
     * Sit down.
     */
    void sit();
}
