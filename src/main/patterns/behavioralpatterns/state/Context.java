package main.patterns.behavioralpatterns.state;

/**
 * The context can have different {@lin State}. Each state will execute a
 * different action. 
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.14
 */
class Context {

    private State state;

    /**
     * Start the request. The inner state will determine what action will be
     * executet.
     */
    void request() {

        this.state.handle();
    }

    /**
     * Set the state of the context.
     * 
     * @param newState                  The new state of the context.
     */
    void setState(State newState) {

        this.state = newState;
    }
}
