import AttractionType.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp(){
       park = new Park("Public", 300);
    }

    @Test
    public void canGetName(){
        assertEquals("Public", park.getName());
    }



}
