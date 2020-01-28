import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.checkVolume());
    }

    @Test
    public void hasBeenSipped() {
        assertEquals(90, waterBottle.sipFrom());
    }

    @Test
    public void hasBeenEmptied() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void hasBeenFilled() {
        assertEquals(100, waterBottle.fill());
    }

}
