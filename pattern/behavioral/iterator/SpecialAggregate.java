package behavioral.iterator;

/**
 * This is a special implementation of the {@link Iterator} type.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.18
 */
class SpecialAggregate implements Aggregate {

    private int[] data;
    
    SpecialAggregate() {

        this.data = new int[100];

        for (int i = 0; i < this.data.length; i++) {

            this.data[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {

        return new SpecialIterator(this.data);
    }
}
