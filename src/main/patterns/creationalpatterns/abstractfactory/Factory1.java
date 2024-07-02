package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link AbstractFactory} that create {@link ProductA1} and
 * {@link ProductB1} type from the {@link ProductA} and {@link ProductB} 
 * supertype.
 * 
 * @author                              o.le
 * @version                             1.3
 * @since                               0.3
 */
class Factory1 implements AbstractFactory {

    /**
     * This method create an object from the type {@link ProductA1}.
     * 
     * @return                          The product that is created
     *                                  by the factory.
     */
    @Override
    public ProductA createProductA() {
        
        return new ProductA1();
    }

    /**
     * This method create an object from the type {@link ProductB1}.
     * 
     * @return                          The product that is created
     *                                  by the factory.
     */
    @Override
    public ProductB createProductB() {
        
        return new ProductB1();
    }
}
