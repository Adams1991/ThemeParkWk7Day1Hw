import AttractionType.Dodgems;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Scary Dodge", 300);
    }

    @Test
    public void canGetName(){
        assertEquals("Scary Dodge", dodgems.getName());
    }

}
