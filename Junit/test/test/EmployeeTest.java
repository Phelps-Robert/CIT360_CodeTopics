package test;

import employee.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RJ
 */

public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of greaterSeniority method, of class CalcNextEmployee.
     */
    @Test
    public void testGreaterSeniority() {
        System.out.println("greaterSeniority");
        int a = 10;
        int b = 12;
        int c = 4;
        int d = 6;
        Employee instance = new Employee();
        int expResult = 4;
        int result = instance.Seniority(a, b, c, d);
        assertEquals(expResult, result);
    }

    /**
     * Test of mostVolunteered method, of class CalcNextEmployee.
     */
    @Test
    public void testMostVolunteered() {
        System.out.println("mostVolunteered");
        int a = 1;
        int b = 5;
        int c = 3;
        int d = 2;
        Employee instance = new Employee();
        int expResult = 5;
        int result = instance.mostVolunteered(a, b, c, d);
        assertEquals(expResult, result);
    }
    
}