package creational.prototype;

class ConcretePrototype implements Prototype {

    private int x;

    public ConcretePrototype(int x) {

        this.x = x;
    }

    @Override
    public Prototype clone() { return new ConcretePrototype(this.x); }
}
