package övningsuppgift7;

import junit.framework.TestCase;
import org.junit.Test;


public class CirkelTest {
    Cirkel c = new Cirkel(4,5,2);
    
    @Test
    public final void areaTest() {
        TestCase.assertTrue((Math.abs(2*2*Math.PI)-12.56 < 0.01));
        TestCase.assertFalse(c.area() == 3);
    }
    
    @Test
    public final void omkretsTest() {
        TestCase.assertTrue(Math.abs(c.omkrets()-12.56) < 0.01);
        TestCase.assertFalse(c.omkrets() == 2*Math.PI);
    }
}
