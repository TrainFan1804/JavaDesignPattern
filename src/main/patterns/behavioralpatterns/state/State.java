package main.patterns.behavioralpatterns.state;

/**
 * The state pattern help to describe behavior of the {@link Context} type.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/State_pattern.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.14
 */
public interface State {

    /**
     * Handle the current state.
     */
    void handle();
}
