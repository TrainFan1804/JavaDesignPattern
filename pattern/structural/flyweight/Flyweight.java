package structural.flyweight;

/**
 * A pattern that refer to an object that minimize memorey by sharing important
 * information to similar object are called <b>flyweight</b>.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Flyweight_pattern.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.1
 */
public interface Flyweight {

    /**
     * Share the stored data with other objects.
     */
    void share();   
}
