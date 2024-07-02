package main.patterns.creationalpatterns.builder;

/**
 * This is a type that represent an object that has multiple {@link ProductPart}.
 * All parts are assembled by the builder too.
 * <p>
 * This type is created by an {@link Builder}.
 * 
 * @author                              o.le
 * @version                             2.2
 * @since                               0.4
 */
class ComplexObject {

    ProductPart p1;
    ProductPart p2;
}
