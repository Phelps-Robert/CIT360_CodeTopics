/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Keith
 */
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
