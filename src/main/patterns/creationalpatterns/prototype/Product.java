package main.patterns.creationalpatterns.prototype;

/**
 * This is a product that is also a {@link Prototype}.
 * 
 * @author                              o.le
 * @version                             1.4
 * @since                               0.4
 */
class Product implements Prototype {

    private int x;

    /**
     * Create a new Product.
     */
    Product(int x) {

        this.x = x;
    }

    @Override
    public Product clone() {

        return new Product(this.x);
    }
}
