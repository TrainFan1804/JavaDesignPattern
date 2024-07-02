package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link Chair} that represent an modern chair.
 * <p>
 * This type is created by an {@link ModernFurnitureFactory}.
 * 
 * @author                              o.le
 * @version                             1.0
 * @since                               0.3
 */
class ModernChair implements Chair {

    @Override
    public void sit() {
        
        System.out.println("Sit down on the modern chair.");
    }
}
