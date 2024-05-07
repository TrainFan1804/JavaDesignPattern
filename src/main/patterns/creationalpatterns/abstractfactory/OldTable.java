package main.patterns.creationalpatterns.abstractfactory;

/**
 * @author                              o.le
 * @version                             0.1.2
 * @since                               0.3.5
 */
class OldTable implements Table {

    @Override
    public void lay() {

        System.out.println("Laid down something on the old table.");
    }
}
