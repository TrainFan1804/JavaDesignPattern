package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is an chair interface that is implemented by all types
 * that should have the behaivior from an {@link Chair} type.
 * <p>
 * All chair are created by an subtype from the {@link AbstractFactory}
 * type.
 * 
 * @see ModernChair
 * @see OldChair
 * 
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.3.5
 */
interface Chair {

    /**
     * Sit down.
     */
    void sit();
}
