package main.patterns.creationalpatterns.prototype;

/**
 * This is a special {@link Animal} that represent an cat.
 * <p>
 * This type is implementing the {@link Prototype} interface so this
 * type can create an copy from an instance that call the method
 * {@link Cat#clone()}.
 * 
 * @author                              o.le
 * @version                             1.0.4
 * @since                               0.4.6
 */
class Cat implements Animal, Prototype {

    String name;

    /**
     * Create a Cat.
     * @param name
     */
    Cat(String name) {

        this.name = name;
    }

    /**
     * This method create an copy from the {@link Cat} type.
     * 
     * @return                          The cat that is copyed by
     *                                  the prototype.
     */
    @Override
    public Animal clone() {

        return new Cat(this.name);
    }
}
