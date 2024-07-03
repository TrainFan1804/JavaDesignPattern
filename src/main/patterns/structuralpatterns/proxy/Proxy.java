package main.patterns.structuralpatterns.proxy;

/**
 * A type that is used to delegate a object call to another object is called a
 * proxy object.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Proxy_pattern.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.1
 */
public class Proxy implements Subject {

    private Subject realSubject = new RealSubject();
    
    @Override
    public void operation() {

        System.out.println("The proxy is called and delegate the method call.");
        this.realSubject.operation();
    }
}
