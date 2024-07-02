package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link Table} that represent an modern table.
 * <p>
 * This type is created by an {@link ModernFurnitureFactory}.
 * 
 * @author                              o.le
 * @version                             1.1
 * @since                               0.3
 */
class ModernTable implements Table {

    @Override
    public void lay(Object something) {

        System.out.println("Laid down something on the modern table.");
    }
}
