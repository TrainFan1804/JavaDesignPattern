package main.patterns.creationalpatterns.builder;

/**
 * This type represent the director that use the {@link Builder}. The director
 * direct what should be build.
 * 
 * @author                              o.le
 * @version                             0.6
 * @since                               0.7
 */
class Director {

    private Builder builder = new Builder();

    void construct() {

        this.builder.buildPartOne();
    }

    public static void main(String[] args) {
        
        Director director = new Director();
        director.construct();
        director.builder.getResult();
    }
}
