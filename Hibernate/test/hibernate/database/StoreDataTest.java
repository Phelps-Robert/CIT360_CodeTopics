
package hibernate.database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StoreDataTest {
    
    public StoreDataTest() {
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
    public void testStoreEmployeeData() {
        System.out.println("storeEmployeeData");
        int id = 0;
        String firstName = "John";
        String lastName = "Doe";
        Employee empInstance = new Employee(id, firstName, lastName);
        StoreData instance = new StoreData();
        instance.storeEmployeeData(id, firstName, lastName);
        assertEquals(empInstance, instance.employeeList.get(id)); 
    }
    
}
