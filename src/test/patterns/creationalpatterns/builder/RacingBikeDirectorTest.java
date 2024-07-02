package test.patterns.creationalpatterns.builder;

// custom import
import main.patterns.creationalpatterns.builder.ComplexObject;
import main.patterns.creationalpatterns.builder.Builder;
import main.patterns.creationalpatterns.builder.CanyonBuilder;
import main.patterns.creationalpatterns.builder.RacingBikeDirector;
// JUnit import
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * This class test the <b>Buildern</b> pattern.
 * 
 * @see Builder
 * 
 * @author                              o.le
 * @version                             2.1.2
 * @since                               0.5.4
 */
public class RacingBikeDirectorTest {

    @Test
    public void testGetResult() {

        RacingBikeDirector director = new RacingBikeDirector(new CanyonBuilder());
        assertNull(director.getResult());

        director.constructBike();
        ComplexObject constructedBike = director.getResult();
        assertEquals(28, constructedBike.heigth);
        assertEquals("Canyon", constructedBike.brand);
        assertEquals("Endurace", constructedBike.model);
        assertEquals("blue", constructedBike.color);
    }
}
