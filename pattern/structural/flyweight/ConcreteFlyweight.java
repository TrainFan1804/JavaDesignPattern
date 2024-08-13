package structural.flyweight;

class ConcreteFlyweight implements Flyweight {

    private int data;

    public ConcreteFlyweight(int data) {

        this.data = data;
    }

    @Override
    public int operation() { return this.data; }
}
