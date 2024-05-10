package test.patterns.creationalpatterns;

// custom import
import main.patterns.creationalpatterns.Multiton;
// JUnit import
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * This class test the {@link Multiton} pattern.
 * 
 * @author                              o.le
 * @version                             1.2.2
 * @since                               0.5.3
 */
public class MultitonTest {

    @Test
    public void testGetInstaceReturnTheSameObjectWhenAskForSameKey() {

        Multiton multitonOne = Multiton.getInstace(5);
        Multiton multitonTwo = Multiton.getInstace(5);
        assertEquals(multitonOne, multitonTwo);
    }

    @Test
    public void testGetInstaceReturnTheDifferentObjectWhenAskForDifferentKey() {

        Multiton multitonOne = Multiton.getInstace(5);
        Multiton multitonTwo = Multiton.getInstace(1);
        assertNotEquals(multitonOne, multitonTwo);
    }
}
