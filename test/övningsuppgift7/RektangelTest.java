package övningsuppgift7;

import junit.framework.TestCase;
import org.junit.Test;

public class RektangelTest {
    
    Rektangel r = new Rektangel(2,3,4,5);
    
    @Test
    public void testaRektangelArea(){
        TestCase.assertTrue(r.area() == 20);
         TestCase.assertFalse(r.area() == 15);
    }
    
    @Test
    public void testaRektangelString(){
        TestCase.assertEquals(r.testString(), "test");
    }
}
