package behavioral.memento;

class Originator {

    private int data;

    public Originator(int data) {

        this.data = data;
    }

    public int getData() { return this.data; }
    
    public void setData(int data) { this.data = data; }

    public Memento createMemento() { return new Memento(data); }

    public void restore(Memento memento) { this.data = memento.getData(); }
}
