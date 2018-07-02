import People.Visitor;
import ThemePark.Stall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallTest {

    Stall stall;
    Visitor visitor;

    @Before
    public void setUp(){
        stall = new Stall("Bla", "BlaBla", 300) {
        };
        visitor = new Visitor("Bob", 160, 400, 17);
    }



}
