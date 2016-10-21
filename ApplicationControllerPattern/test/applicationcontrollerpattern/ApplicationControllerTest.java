
package applicationcontrollerpattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ApplicationControllerTest {

    public ApplicationControllerTest() {
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
    public void testRequestCalculation() {
        System.out.println("requestCalculation");
        char operator = '+';
        double[] inputs = {10, 5};
        ApplicationController instance = new ApplicationController();
        double expResult = 15;
        double result = instance.requestCalculation(operator, inputs);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    //Tests if an exception will be thrown when no operator is passed in.
    public void testRequestCalculation2() {
        System.out.println("requestCalculation");
        char operator = ' ';
        double[] inputs = {10, 5};
        ApplicationController instance = new ApplicationController();
        boolean result;
        try {
            instance.requestCalculation(operator, inputs);
            result = true; //Exception not Thrown
        }
        catch (Exception e) {
            result = false; //Exception Thrown
        }       
        assertFalse(result); //If the exception was thrown then the unit test passes.
    }

}
