package main.patterns.structuralpatterns.flyweight;

/**
 * This class is a subtype of the {@link Flyweight} type. This type will show
 * you how much cheese is saved.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.10
 */
class FlyweightOne implements Flyweight {

    private int data;

    FlyweightOne(int data) {

        this.data = data;
    }

    @Override
    public void share() {
        
        System.out.println("The amount of cheese is: " + this.data);
    }
}
