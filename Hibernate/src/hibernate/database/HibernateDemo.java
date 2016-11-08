
package hibernate.database;

/**
 *
 * @author RJ
 */
public class HibernateDemo {
    public void runHibernateDemo() {
        // Hibernate
        System.out.println("Hibernate Example:");
        StoreData storeData = new StoreData();
        storeData.storeEmployeeData(100, "John", "Doe");
        System.out.println();
    }
}
