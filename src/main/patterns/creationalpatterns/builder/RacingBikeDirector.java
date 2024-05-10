package main.patterns.creationalpatterns.builder;

/**
 * This is an director that is the actually class that is called to
 * create an object from the {@link Bicycle} type.
 * 
 * @author                              o.le
 * @version                             2.0.6
 * @since                               0.5.5
 */
public class RacingBikeDirector {

    BicycleBuilder builder;

    /**
     * Create an RacingBikeDirector.
     */
    public RacingBikeDirector(BicycleBuilder builder) {

        this.builder = builder;
    }

    /**
     * Create an {@link Bicycle}.
     */
    public void constructBike() {

        this.builder.setColor("blue");
        this.builder.setHeight(28);
    }

    /**
     * Get the bicycle the builder has build.
     * 
     * @return                          The bicycle that was build.
     */
    public Bicycle getResult() {

        return this.builder.getBicycle();
    }
}
