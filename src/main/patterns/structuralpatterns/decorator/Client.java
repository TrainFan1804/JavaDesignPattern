package main.patterns.structuralpatterns.decorator;

class Client {

    private Component component;

    Client() {

        Component c = new ConcreteComponent();
        this.component = new ConcreteDecorator(c); 
    }

    public static void main(String[] args) {
        
        Client client = new Client();
        System.out.println(client.component.operation()); 
    }
}
