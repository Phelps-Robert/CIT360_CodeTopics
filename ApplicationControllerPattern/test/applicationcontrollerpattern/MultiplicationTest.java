
package applicationcontrollerpattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MultiplicationTest {
    
    public MultiplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculate() {
        System.out.println("calculate");
        double[] inputs = {10, 5};
        Multiplication instance = new Multiplication();
        double expResult = 50;
        double result = instance.calculate(inputs);
        assertEquals(expResult, result, 0.0);
    }
    
}
