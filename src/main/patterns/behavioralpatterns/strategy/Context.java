package main.patterns.behavioralpatterns.strategy;

/**
 * This type represent the context. The context determines the {@link Strategy}
 * that is executed.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.19
 */
class Context {

    Strategy strategy = new SpecialStrategy();

    /**
     * The context will start the strategy.
     */
    void operation() {

        this.strategy.algorithm();
    }
}
