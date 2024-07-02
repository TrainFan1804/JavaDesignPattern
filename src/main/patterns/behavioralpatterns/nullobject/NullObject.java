package main.patterns.behavioralpatterns.nullobject;

/**
 * The null object pattern is used when a {@link AbstractObject} can be null
 * but you don't want to catch the null object with a if condition. When the
 * null object is called it's do nothing.
 * <p>
 * For more information: https://www.baeldung.com/java-null-object-pattern.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.1
 */
public class NullObject implements AbstractObject {

    @Override
    public void doSomething() {
     
        System.out.println("Ignore this object");
    }
}
