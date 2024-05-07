package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link AbstractFactory} that create  an modern
 * type from the {@link Chair} and {@link Table} subtype.
 * 
 * @see ModernChair
 * @see ModernTable
 * 
 * @author                              o.le
 * @version                             1.1.4
 * @since                               0.3.6
 */
class ModernFurnitureFactory implements AbstractFactory {

    private static ModernFurnitureFactory instance;

    /**
     * Create an ModernFurnitureFactory.
     */
    private ModernFurnitureFactory() {}

    /**
     * Return the instance of the ModernFurnitureFactory. When the 
     * modern furniture factory has no instance there will be created
     * one instance of the factory.
     * 
     * @return                          The instance of the modern
     *                                  furniture factory factory.
     */
    public static ModernFurnitureFactory getInstace() {

        if (ModernFurnitureFactory.instance == null) {

            ModernFurnitureFactory.instance = new ModernFurnitureFactory();
        }

        return ModernFurnitureFactory.instance;
    }

    /**
     * This method create an object from the type {@link ModernChair}.
     * 
     * @return                          The modern chair that is created
     *                                  by the factory.
     */
    @Override
    public Chair createChair() {
        
        return new ModernChair();
    }

    /**
     * This method create an object from the type {@link ModernTable}.
     * 
     * @return                          The modern table that is created
     *                                  by the factory.
     */
    @Override
    public Table createTable() {
        
        return new ModernTable();
    }
}
