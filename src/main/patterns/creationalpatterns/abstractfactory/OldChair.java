package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link Chair} that represent an old chair.
 * <p>
 * This type is created by an {@link OldFurnitureFactory}.
 * 
 * @author                              o.le
 * @version                             1.0.0
 * @since                               0.3.5
 */
class OldChair implements Chair {

    @Override
    public void sit() {
        
        System.out.println("Sit down on the old chair.");
    }
}
