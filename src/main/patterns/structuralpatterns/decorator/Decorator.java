package main.patterns.structuralpatterns.decorator;

public abstract class Decorator implements Component {

    protected Component component;

    Decorator(Component component) {

        this.component = component;
    }

    @Override
    public abstract String operation();
}
