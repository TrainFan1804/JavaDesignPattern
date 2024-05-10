package main.patterns.creationalpatterns.builder;

/**
 * An type that can create parts of other object are called <b>Builder</b>.
 * <p>
 * In this exapmle: This is an builder interface that is implemented
 * by all types that should create parts of object's there are implements
 * the {@link Bicycle} type.
 * 
 * @see CanyonBuilder
 * 
 * @author                              o.le
 * @version                             2.1.2
 * @since                               0.4.2
 */
public interface BicycleBuilder {

    /**
     * This method create an object from the type {@link Bicycle}.
     * 
     * @return                          The bicycle that is created by
     *                                  the builder.
     */
    Bicycle getBicycle();

    /**
     * Return's the height of the bicycle the builder is building.
     * 
     * @return                          The height of the creating
     *                                  bicycle.
     */
    int getHeight();

    /**
     * Set the height field of the builder. The height that is 
     * set is also the height of the created bicycle.
     * 
     * @param height                    The height of the wanted bicycle.
     * @return                          The same builder instance 
     *                                  that call this function.                                 
     */
    void setHeight(int height);

    /**
     * Return's the color of the bicycle the builder is building.
     * 
     * @return                          The color of the creating
     *                                  bicycle.
     */
    String getColor();

    /**
     * Set the color field of the builder. The color that is 
     * set is also the color of the created bicycle.
     * 
     * @param color                     The color of the wanted bicycle.
     * @return                          The same builder instance 
     *                                  that call this function.                                 
     */
    void setColor(String color);
}
