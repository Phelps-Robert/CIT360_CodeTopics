package hibernate.database;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public Map<Integer, Employee> employeeList = new HashMap<>();

    public void storeEmployeeData(int id, String firstName, String lastName) {

        employeeList.put(id, new Employee(id, "John", "Doe"));

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(employeeList.get(id));

        transaction.commit();

        session.close();

        System.out.println("Employee record saved");
    }
}
