package main.patterns.creationalpatterns.builder;

/**
 * This is a special {@link Pizza} that represent an pizza.
 * <p>
 * This type is created by an {@link EverythingPizzaBuilder}.
 * 
 * @author                              o.le
 * @version                             1.0.2
 * @since                               0.4.3
 */
class EverythingPizza implements Pizza {

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
    EverythingPizza(String dough, String sauce, boolean cheese, boolean meat, boolean vegetables) {
    
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }
}
