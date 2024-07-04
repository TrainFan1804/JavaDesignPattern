package main.patterns.behavioralpatterns.strategy;

/**
 * The strategy pattern is usefull when you want to provide different algorithm
 * for the same {@link Context}. You can always change the algorithm that will
 * be executed by the context.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Strategy_pattern.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.14
 */
public interface Strategy {

    /**
     * Execute the saved algorithm.
     */
    void algorithm();   
}
