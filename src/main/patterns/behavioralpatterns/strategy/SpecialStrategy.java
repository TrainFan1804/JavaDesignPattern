package main.patterns.behavioralpatterns.strategy;

/**
 * This type is a special {@link Strategy}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.19
 */
class SpecialStrategy implements Strategy {

    @Override
    public void algorithm() {
        
        System.out.println("This special algorithm will be executed");
    }
}
