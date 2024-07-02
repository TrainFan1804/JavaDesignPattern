package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is an table interface that is implemented by all types
 * that should have the behaivior from an {@link Table} type.
 * <p>
 * All table are created by an subtype from the {@link AbstractFactory}
 * type.
 * <p>
 * This is an functional interface.
 * 
 * @see ModernTable
 * @see OldTable
 * 
 * @author                              o.le
 * @version                             1.1
 * @since                               0.3
 */
interface Table {

    /**
     * Lay something on the table.
     * 
     * @param something                 The object that is laying down
     *                                  on the table.
     */
    void lay(Object something);
}
