package main.patterns.creationalpatterns.builder;

/**
 * This is a special {@link BicycleBuilder} that create an {@link Bicycle}.
 * 
 * @author                              o.le
 * @version                             2.0.2
 * @since                               0.4.3
 */
public class CanyonBuilder implements BicycleBuilder {

    int height;
    String color;

    @Override
    public Bicycle getBicycle() {
        
        return this.height == 28 ? new Bicycle("Canyon", "Endurace", this.color, this.height) : null;
    }

    @Override
    public int getHeight() {
        
        return this.height;
    }

    @Override
    public void setHeight(int height) {
        
        this.height = height;
    }

    @Override
    public String getColor() {
        
        return this.color;
    }

    @Override
    public void setColor(String color) {
        
        this.color = color;
    }   
}
