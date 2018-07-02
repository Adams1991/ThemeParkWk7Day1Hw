import StallType.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp(){
        iceCreamStall = new IceCreamStall("Billy's Candy", "Billy", 300);
    }

    @Test
    public void canGetName(){
        assertEquals("Billy's Candy", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Billy", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(300, iceCreamStall.getParkingSpot());
    }
}
