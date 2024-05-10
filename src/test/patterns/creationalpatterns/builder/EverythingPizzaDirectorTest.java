package test.patterns.creationalpatterns.builder;

// custom import
import main.patterns.creationalpatterns.builder.Builder;
import main.patterns.creationalpatterns.builder.EverythingPizzaBuilder;
import main.patterns.creationalpatterns.builder.EverythingPizzaDirector;

// JUnit import
import org.junit.Test;

/**
 * This class test the {@link Builder} pattern.
 * 
 * @author                              o.le
 * @version                             1.0.1
 * @since                               0.5.4
 */
public class EverythingPizzaDirectorTest {

    @Test
    public void testGetProduct() {

        EverythingPizzaDirector p = new EverythingPizzaDirector(
                                        new EverythingPizzaBuilder(
                                                    "Wheat", 
                                                    "Tomato"));

        p.getProduct();
    }
}
