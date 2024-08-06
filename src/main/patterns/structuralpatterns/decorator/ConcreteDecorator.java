package main.patterns.structuralpatterns.decorator;

class ConcreteDecorator extends Decorator {

    ConcreteDecorator(Component component) {

        super(component);
    }

    @Override
    public String operation() {
       
        return this.component.operation() + ", with " + ConcreteDecorator.class.toString();
    }
}
