package behavioral.iterator;

class ConcreteAggregate implements Aggregate {

    private int[] data;
    
    public ConcreteAggregate(int[] data) {

        this.data = data;
    }

    @Override
    public Iterator createIterator() { return new ConcreteIterator(this.data); }
}
