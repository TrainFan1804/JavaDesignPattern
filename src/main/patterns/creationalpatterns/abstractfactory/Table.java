package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is an table interface that is implemented by all types
 * that should have the behaivior from an {@link Table} type.
 * <p>
 * All table are created by an subtype from the {@link AbstractFactory}
 * type.
 * 
 * @see ModernTable
 * @see OldTable
 * 
 * @author                              o.le
 * @version                             1.0.1
 * @since                               0.3.5
 */
interface Table {

    void lay();
}
