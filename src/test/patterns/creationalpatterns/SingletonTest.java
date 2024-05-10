package test.patterns.creationalpatterns;

// custom import
import main.patterns.creationalpatterns.Singleton;
// JUnit import
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class test the {@link Singleton} pattern.
 * 
 * @author                              o.le
 * @version                             1.2.1
 * @since                               0.5.3
 */
public class SingletonTest {

    @Test
    public void testGetInstaceRetunTheSameObject() {

        Singleton singletonOne = Singleton.getInstace();
        Singleton singletonTwo = Singleton.getInstace();
        assertEquals(singletonOne, singletonTwo);
    }
}
