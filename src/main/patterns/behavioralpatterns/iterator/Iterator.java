package main.patterns.behavioralpatterns.iterator;

/**
 * With the iterator pattern you can traverse a container and access his 
 * elements without exposing his elements. This pattern is also know as
 * <b>cursor</b>
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Iterator_pattern.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.1
 */
public interface Iterator {

    /**
     * Check if there is a element after the current element.
     * 
     * @return                          {@code true} if there is a next element
     *                                  else {@code false}.
     */
    boolean hasNext();

    /**
     * Return the next element. In this example it's a integer datatype.
     * 
     * @return                          The next element.
     */
    int next();
}
