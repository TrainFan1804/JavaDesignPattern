package behavioral.iterator;

/**
 * This type represent a type that can create a {@link Iterator}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.18
 */
interface Aggregate {

    /**
     * Create a new iterator for this type.
     * 
     * @return                          The new iterator.
     */
    Iterator createIterator();
}
