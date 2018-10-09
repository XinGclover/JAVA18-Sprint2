package TDDCalculator;

import junit.framework.TestCase;
import org.junit.Test;

public class TDDCalculatorTest {
    
    TDDCalculator c = new TDDCalculator();
    
    @Test
    public void isAdditionCorrect(){
        int a = 3;
        int b = 5;
        TestCase.assertTrue(c.add(a, b) == 8);
        TestCase.assertFalse(c.add(a, b) == 10);
    }
    
    @Test
    public void isSubtractionCorrect(){
        int a = 10;
        int b = 5;
        TestCase.assertTrue(c.subtract(a, b) == 5);
        TestCase.assertFalse(c.subtract(a, b) == 2);
    }
    
    @Test
    public void isMultiplicationCorrect(){
        int a = 10;
        int b = 5;
        TestCase.assertTrue(c.multiply(a, b) == 50);
        TestCase.assertFalse(c.multiply(a, b) == 2);
    }
            
    @Test
    public void isDivisionCorrect(){
        int a = 10;
        int b = 5;
        String operator = "/";
        TestCase.assertTrue(c.divide(a, b) == 2);
        TestCase.assertFalse(c.divide(a, b) == 4);
    }
    
    @Test 
    public void isOperatorCorrect(){
        String op1 = "+";
        String op2 = "-";
        String op3 = "*";
        String op4 = "/";
        String falseOp = "&";
        TestCase.assertTrue(c.verifyOperator(op1));
        TestCase.assertTrue(c.verifyOperator(op2));
        TestCase.assertTrue(c.verifyOperator(op3));
        TestCase.assertTrue(c.verifyOperator(op4));
        TestCase.assertFalse(c.verifyOperator(falseOp));
    }
    
    @Test
    public void calculateTest(){
        int a = 8;
        int b = 4;
        String op1 = "+";
        String op2 = "-";
        String op3 = "*";
        String op4 = "/";
        String falseOp = "&";
        try{
            TestCase.assertTrue(c.calculate(a, b, op1) == 12);
            TestCase.assertTrue(c.calculate(a, b, op2) == 4);
            TestCase.assertTrue(c.calculate(a, b, op3) == 32);
            TestCase.assertTrue(c.calculate(a, b, op4) == 2);
            TestCase.assertFalse(c.calculate(a, b, falseOp) == 2);
        }
        catch (Exception e){
            
        }
    }
    
    @Test (expected = Exception.class) 
    public void throwsExceptionIfOperatorWrong() throws Exception{
        String falseOp = "&";
        int a = 8;
        int b = 4;
        try{
            c.calculate(a, b, falseOp);
            }
        catch (Exception e){
            throw e;
        }
    }
}
