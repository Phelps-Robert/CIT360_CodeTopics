
package junittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTripStatsTest {
    
    public CalculateTripStatsTest() {
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

    /**
     * Test of mpg method, of class CalculateTripStats.
     */
    @Test
    public void testMpgZero() {
        System.out.println("mpg zero test: 0 Miles, 0 Gallons.");
        int milesDriven = 0;
        int gallonsUsed = 0;
        int expResult = 0;
        int result = CalculateTripStats.mpg(milesDriven, gallonsUsed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mpg method, of class CalculateTripStats.
     */
    @Test
    public void testMpg() {     
        System.out.println("mpg test: 120 Miles, 4 Gallons.");
        int milesDriven = 120;
        int gallonsUsed = 4;
        int expResult = 30;
        int result = CalculateTripStats.mpg(milesDriven, gallonsUsed);
        assertEquals(expResult, result);
    }

    /**
     * Test of mph method, of class CalculateTripStats.
     */
    @Test
    public void testMphZero() {
        System.out.println("mph zero test: 0 Miles, 0 hours.");
        int milesDriven = 0;
        int hoursDriven = 0;
        int expResult = 0;
        int result = CalculateTripStats.mph(milesDriven, hoursDriven);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mph method, of class CalculateTripStats.
     */
    @Test
    public void testMph() {
        System.out.println("mph test: 120 Miles, 2 hours.");
        int milesDriven = 120;
        int hoursDriven = 2;
        int expResult = 60;
        int result = CalculateTripStats.mph(milesDriven, hoursDriven);
        assertEquals(expResult, result);
    }
    
}
