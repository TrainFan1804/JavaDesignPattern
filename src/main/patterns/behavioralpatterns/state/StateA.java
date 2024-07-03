package main.patterns.behavioralpatterns.state;

/**
 * This type represent a state.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.14
 */
class StateA implements State {

    @Override
    public void handle() {
    
        System.out.println("Context is in state A");
    }
}
