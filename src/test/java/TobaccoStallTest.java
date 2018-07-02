import StallType.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Billy's Candy", "Billy", 300);
    }

    @Test
    public void canGetName(){
        assertEquals("Billy's Candy", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Billy", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(300, tobaccoStall.getParkingSpot());
    }
}
