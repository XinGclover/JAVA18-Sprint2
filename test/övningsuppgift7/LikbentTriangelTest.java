package övningsuppgift7;

import junit.framework.TestCase;
import org.junit.Test;


public class LikbentTriangelTest {
    LikbentTriangel t = new LikbentTriangel(5,4,8,3);

    @Test
    public final void areaTest() {
        TestCase.assertTrue(t.area() == 12);
        TestCase.assertFalse(t.area() == 19);
    }   
    
    @Test
    public final void omkretsTest() {
        TestCase.assertTrue(t.omkrets() == 18);
        TestCase.assertFalse(t.omkrets() == 20);
    }
}
