package structural.adapter;

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {

        this.adaptee = adaptee;
    }

    @Override
    public void request() { this.adaptee.specificRequest(); }
}
