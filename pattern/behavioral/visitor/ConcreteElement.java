package behavioral.visitor;

class ConcreteElement implements Element {

    @Override
    public void accept(Visitor visitor) { visitor.visitElement(this); }
}
