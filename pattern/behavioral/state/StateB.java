package behavioral.state;

/**
 * This type represent a state.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.14
 */
class StateB implements State {

    @Override
    public void handle() {
     
        System.out.println("Context is in state B");
    }
}
