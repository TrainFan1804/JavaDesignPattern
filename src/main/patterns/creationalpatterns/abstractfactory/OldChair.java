package main.patterns.creationalpatterns.abstractfactory;

/**
 * @author                              o.le
 * @version                             0.1.1
 * @since                               0.3.5
 */
class OldChair implements Chair {

    @Override
    public void sit() {
        
        System.out.println("Sit down on the old chair.");
    }
}
