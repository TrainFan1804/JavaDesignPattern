package main.patterns.creationalpatterns.builder;

public class Builder {

    private ComplexObject c = new ComplexObject();

    Builder withFirstPartAs(Object obj) {

        c.setFirstPart(obj);
        return this;
    }

    Builder withSecondPartAs(Object obj) {

        c.setSecondPart(obj);
        return this;
    }

    ComplexObject getResult() { return this.c; }
}
