package main.patterns.behavioralpatterns.iterator;

/**
 * This type represent special {@link Iterator}.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.18
 */
class SpecialIterator implements Iterator {

    private int counter;
    private final int[] data;
    
    SpecialIterator(int[] data) {

        this.data = data;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        
        return this.counter != this.data.length;
    }

    @Override
    public int next() {
        
        return this.data[this.counter++];
    }
}
