import AttractionType.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("Scary Coaster");
    }

    @Test
    public void canGetName(){
        assertEquals("Scary Coaster", rollercoaster.getName());
    }
}
