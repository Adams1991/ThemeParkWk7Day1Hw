import StallType.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("Billy's Candy", "Billy", 300, 300);
    }

    @Test
    public void canGetName(){
        assertEquals("Billy's Candy", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Billy", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(300, candyFlossStall.getParkingSpot());
    }



}
