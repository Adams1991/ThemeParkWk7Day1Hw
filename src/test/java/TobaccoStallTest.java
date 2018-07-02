import People.Visitor;
import StallType.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Billy's Candy", "Billy", 300);
        visitor = new Visitor("Jim", 200, 300, 16);
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

    @Test
    public void isAllowedToWorking(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
