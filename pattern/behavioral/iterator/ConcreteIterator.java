package behavioral.iterator;

class ConcreteIterator implements Iterator {

    private int counter;
    private final int[] DATA;
    
    public ConcreteIterator(int[] data) {

        this.DATA = data;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() { return this.counter != this.DATA.length; }

    @Override
    public int next() { return this.DATA[this.counter++]; }
}
