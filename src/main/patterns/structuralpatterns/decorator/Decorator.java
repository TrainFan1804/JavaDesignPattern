package main.patterns.structuralpatterns.decorator;

abstract class Decorator implements Component {

    protected Component component;

    protected Decorator(Component component) {

        this.component = component;
    }

    @Override
    public abstract String operation();
}
