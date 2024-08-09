package structural.bridge;

class Client {

    public static void main(String[] args) {
        
        Implementor implementor = new ConcreteImplementor("Bridge pattern");
        Abstraction abstraction = new ConcreteAbstraction(implementor);
        
        System.out.println(abstraction.function());
    }
}
