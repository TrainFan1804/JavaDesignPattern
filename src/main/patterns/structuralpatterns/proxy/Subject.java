package main.patterns.structuralpatterns.proxy;

/**
 * The {@link Client} call a Subject to execute a operation.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.11
 */
interface Subject {

    /**
     * Execute a operation. 
     */
    void operation();
}
