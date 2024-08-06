package main.patterns.structuralpatterns.decorator;

/**
 * The decorator pattern can 'decorate' an object from the {@link Component}
 * type without changing other subtypes of the component type.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://de.wikipedia.org/wiki/Decorator.
 * 
 * @author                              o.le
 * @version                             1.1
 * @since                               0.12
 */
public abstract class Decorator implements Component {

    protected Component component;

    Decorator(Component component) {

        this.component = component;
    }

    @Override
    public abstract String operation();
}
