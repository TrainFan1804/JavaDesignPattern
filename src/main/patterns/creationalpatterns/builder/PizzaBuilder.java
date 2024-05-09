package main.patterns.creationalpatterns.builder;

/**
 * This is a special {@link Builder} that create  an {@link Product} 
 * from the {@link Pizza} type.
 * 
 * @author                              o.le
 * @version                             1.1.3
 * @since                               0.4.3
 */
class PizzaBuilder implements Builder {

    String dough;
    String sauce;
    
    boolean cheese;
    boolean meat;
    boolean vegetables;

    /**
     * Create an PizzaBuilder.
     */
    PizzaBuilder(String dough, String sauce) {

        this.dough = dough;
        this.sauce = sauce;
    }

    /**
     * This method create an object from the type {@link Pizza}.
     * 
     * @return                          The pizza that is created by
     *                                  the factory.
     */
    @Override
    public Pizza build() {
        
        return new Pizza(this);
    }

    /**
     * Set the cheese field of the PizzaBuilder. The cheese that is 
     * set is also the cheese of the created pizza.
     * 
     * @param cheese                    The cheese of the wanted pizza.
     * @return                          The same PizzaBuilder instance 
     *                                  that call this function.                                 
     */
    public PizzaBuilder setCheese(boolean cheese) {
        
        this.cheese = cheese;
        return this;
    }

    /**
     * Set the meat field of the PizzaBuilder. The meat that is 
     * set is also the meat of the created pizza.
     * 
     * @param meat                      The meat of the wanted pizza.
     * @return                          The same PizzaBuilder instance 
     *                                  that call this function.                                 
     */
    public PizzaBuilder setMeat(boolean meat) {
        
        this.meat = meat;
        return this;
    }

    /**
     * Set the vegetables field of the PizzaBuilder. The vegetables 
     * that is set is also the vegetables of the created pizza.
     * 
     * @param vegetables                The vegetables of the wanted pizza.
     * @return                          The same PizzaBuilder instance 
     *                                  that call this function.                                 
     */
    public PizzaBuilder setVegetables(boolean vegetables) {
        
        this.vegetables = vegetables;
        return this;
    }
}
