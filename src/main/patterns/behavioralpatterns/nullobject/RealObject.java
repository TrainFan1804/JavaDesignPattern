package main.patterns.behavioralpatterns.nullobject;

/**
 * This is the implementation of the {@link AbstractObject} type with a real
 * implementation.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.5
 */
class RealObject implements AbstractObject {

    @Override
    public void doSomething() {
     
        System.out.println("Do something cool");
    }
}
