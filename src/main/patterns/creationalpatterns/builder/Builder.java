package main.patterns.creationalpatterns.builder;

/**
 * An type that can create parts of other object are called <b>Builder</b>.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Builder_pattern.
 * 
 * @author                              o.le
 * @version                             2.5
 * @since                               0.4
 */
public class Builder {

    private ComplexObject c = new ComplexObject();

    Builder buildPartOne() {

        c.p1 = new ProductPart();
        return this;
    }

    Builder buildPartTwo() {

        c.p2 = new ProductPart();
        return this;
    }

    ComplexObject getResult() {

        return this.c;
    }
}
