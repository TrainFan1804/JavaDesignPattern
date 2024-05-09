package main.patterns.creationalpatterns.builder;

/**
 * This is a special {@link Product} that represent an pizza.
 * <p>
 * This type is created by an {@link PizzaBuilder}.
 * 
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.4.3
 */
class Pizza implements Product {

    String dough;
    String sauce;
    
    boolean cheese;
    boolean meat;
    boolean vegetables;

    /**
     * Create a Pizza with a builder.
     * 
     * @param builder                   The builder that build the pizza.
     *                                  The builder defines the different
     *                                  parts of an pizza.
     */
    Pizza(PizzaBuilder builder) {
    
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
    }
}
