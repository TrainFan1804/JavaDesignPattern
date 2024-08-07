package main.patterns.structuralpatterns.decorator;

class Client {

    public static void main(String[] args) {
       
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        System.out.println(component.operation()); 
    }
}
