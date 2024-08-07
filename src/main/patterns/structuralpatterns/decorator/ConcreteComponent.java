package main.patterns.structuralpatterns.decorator;

class ConcreteComponent implements Component {

    @Override
    public String operation() { return ConcreteComponent.class.toString(); }
}
