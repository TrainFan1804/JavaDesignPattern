package behavioral.visitor;

class Client {

    public static void main(String[] args) {
        
        Element element = new ConcreteElement();
        element.accept(new ConcreteVisitor());
    }
}
