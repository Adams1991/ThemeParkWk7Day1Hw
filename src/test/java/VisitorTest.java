import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor("Bob", 150, 300);

    }

    @Test
    public void canGetName(){
        assertEquals("Bob", visitor.getName());
    }

    @Test
    public void canGetHeight(){
        assertEquals(150, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(300, visitor.getMoney(), 0.01);
    }
}


