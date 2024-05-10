package main.patterns.creationalpatterns.builder;

/**
 * This is a type that represent an bicycle.
 * <p>
 * This type is created by an {@link BicycleBuilder}.
 * 
 * @author                              o.le
 * @version                             2.0.6
 * @since                               0.4.3
 */
public class Bicycle {

    public int heigth;
    public String brand;
    public String model;
    public String color; 

    /**
     * Create a Bicycle with differen type parameter.
     * 
     * @param brand                     The brand of the bicycle.
     * @param model                     The model of the bicycle.
     * @param color                     The color of the bicycle.
     * @param heigth                    The height of the bicycle.
     */
    Bicycle(String brand, String model, String color, int heigth) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.heigth = heigth;
    }
}
