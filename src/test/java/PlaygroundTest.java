
import AttractionType.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void setUp(){
        playground = new Playground("Play");
    }

    @Test
    public void canGetName(){
        assertEquals("Play", playground.getName());
    }


}
