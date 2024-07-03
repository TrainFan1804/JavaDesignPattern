package main.patterns.structuralpatterns.composite;

// java import
import java.util.List;
import java.util.LinkedList;

/**
 * With the help of the composite pattern you can create part-whole hierachies.
 * A composite can have {@link Leaf} as children.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Composite_pattern.
 * 
 * @author                              o.le
 * @version                             0.5
 * @since                               0.1
 */
public class Composite implements Component {

    private List<Component> children = new LinkedList<>();

    @Override
    public void doSomething() {
    
        System.out.println("The component do something");
    }

    /**
     * Add a child to the composite.
     * 
     * @param child                     The adding child. Can be a {@link Leaf}
     *                                  or a {@link Composite} as well.
     */
    void addChild(Component child) {

        this.children.add(child);
    }

    /**
     * Get a child at a specific index.
     * 
     * @param index                     The index of the wanted child.
     * @return                          The child that is at the given index.
     */
    Component getChild(int index) {

        return this.children.get(index);
    }

    // method for removing would be usefull
}
