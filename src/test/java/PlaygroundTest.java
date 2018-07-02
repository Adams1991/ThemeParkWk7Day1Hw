
import AttractionType.Playground;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void setUp(){
        playground = new Playground("Play", 300);
        visitor= new Visitor("Bob", 150, 300, 16);
    }

    @Test
    public void canGetName(){
        assertEquals("Play", playground.getName());
    }

    @Test
    public void isAllowedToWorking(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }


}
