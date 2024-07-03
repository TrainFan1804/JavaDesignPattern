package main.patterns.structuralpatterns.proxy;

/**
 * This type represent the real subject the {@link Client} is calling.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.11
 */
class RealSubject implements Subject {

    @Override
    public void operation() {
     
        System.out.println("The real subject is called!");
    }
}
