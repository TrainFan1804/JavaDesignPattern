package main.patterns.creationalpatterns.builder;

/**
 * This is a special {@link Builder} that create an {@link Pizza} 
 * from the {@link EverythingPizza} type.
 * 
 * @author                              o.le
 * @version                             1.2.2
 * @since                               0.4.3
 */
class EverythingPizzaBuilder implements Builder {

    String dough;
    String sauce;
    
    boolean cheese = true;
    boolean meat = true;
    boolean vegetables = true;

    /**
     * Create an PizzaBuilder.
     */
    EverythingPizzaBuilder(String dough, String sauce) {

        this.dough = dough;
        this.sauce = sauce;
    }

    /**
     * This method create an object from the type {@link EverythingPizza}.
     * 
     * @return                          The pizza that is created by
     *                                  the builder.
     */
    @Override
    public EverythingPizza build() {
        
        return new EverythingPizza(this.dough, this.sauce, this.cheese, 
                                    this.meat, this.vegetables);
    }
}
