package main.patterns.creationalpatterns.abstractfactory;

/**
 * This is a special {@link AbstractFactory} that create an old type
 * from the {@link Chair} and {@link Table} subtype.
 * 
 * @see OldChair
 * @see OldTable
 * 
 * @author                              o.le
 * @version                             1.1
 * @since                               0.3
 */
class OldFurnitureFactory implements AbstractFactory {

    private static OldFurnitureFactory instance;

    /**
     * Create an OldFurnitureFactory.
     */
    private OldFurnitureFactory() {}

    /**
     * Return the instance of the OldFurnitureFactory. When the old
     * furniture factory has no instance there will be created one 
     * instance of the factory.
     * 
     * @return                          The instance of the old
     *                                  furniture factory factory.
     */
    public static OldFurnitureFactory getInstace() {

        if (OldFurnitureFactory.instance == null) {

            OldFurnitureFactory.instance = new OldFurnitureFactory();
        }

        return OldFurnitureFactory.instance;
    }

    /**
     * This method create an object from the type {@link OldChair}.
     * 
     * @return                          The old chair that is created 
     *                                  by the factory.
     */
    @Override
    public Chair createChair() {
        
        return new OldChair();
    }

    /**
     * This method create an object from the type {@link OldTable}.
     * 
     * @return                          The old table that is created 
     *                                  by the factory.
     */
    @Override
    public Table createTable() {
    
        return new OldTable();
    }
}
