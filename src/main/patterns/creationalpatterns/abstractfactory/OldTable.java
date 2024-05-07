package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link Table} that represent an old table.
 * <p>
 * This type is created by an {@link OldFurnitureFactory}.
 * 
 * @author                              o.le
 * @version                             1.1.0
 * @since                               0.3.5
 */
class OldTable implements Table {

    @Override
    public void lay(Object something) {

        System.out.println("Laid down something on the old table.");
    }
}
