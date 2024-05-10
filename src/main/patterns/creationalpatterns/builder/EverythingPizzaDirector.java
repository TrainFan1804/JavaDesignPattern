package main.patterns.creationalpatterns.builder;

class EverythingPizzaDirector {

    private Builder builder;

    EverythingPizzaDirector(Builder builder) {

        this.builder = builder;
    }

    public void makePizza() {

        this.builder.setCheese(true)
                    .setMeat(true)
                    .setVegetables(true);
    }

    public Pizza getProduct() {

        return this.builder.build();
    }
}
