package main.patterns.creationalpatterns.abstractfactory;

/**
 * @author                              o.le
 * @version                             0.1.3
 * @since                               0.3.5
 */
class ModernTable implements Table {

    @Override
    public void lay() {

        System.out.println("Laid down something on the modern table.");
    }
}
