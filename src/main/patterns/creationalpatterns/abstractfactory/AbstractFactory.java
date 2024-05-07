package main.patterns.creationalpatterns.abstractfactory;

/**
 * @author                              o.le
 * @version                             0.1.3
 * @since                               0.3.5
 */
public interface AbstractFactory {

    Chair createChair();

    Table createTable();
}
