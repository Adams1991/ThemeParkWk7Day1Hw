import AttractionType.Rollercoaster;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster("Scary Coaster");
        visitor = new Visitor("Jim", 144, 300, 11);
    }

    @Test
    public void canGetName(){
        assertEquals("Scary Coaster", rollercoaster.getName());
    }

    @Test
    public void isAllowedToWorking(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }
}
