
package hibernate;

import hibernate.factory.FactoryDemo;
import hibernate.proxy.ProxyDemo;
import hibernate.singleton.SingletonDemo;
import hibernate.database.HibernateDemo;
import java.util.Scanner;

/**
 *
 * @author RJ
 */
public class Hibernate {

    private static final String MENUITEMS = "Please select a menu item:\n"
            + "\t0. Exit Program\n"
            + "\t1. Singleton\n"
            + "\t2. Proxy\n"
            + "\t3. Factory\n"
            + "\t4. Hibernate Database\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayHibernateMenu();
    }
    
    public static void displayHibernateMenu() {
        boolean valid = false;
        while (!valid) {
            System.out.println(MENUITEMS);
            Scanner scanner = new Scanner(System.in);
            int menuChoice = scanner.nextInt();
            valid = runExample(menuChoice);
        }
    }
    
    public static boolean runExample(int menuChoice) {
        switch (menuChoice) {
            case 0:
                return true;
            case 1:
                SingletonDemo singletonDemo = new SingletonDemo();
                singletonDemo.runSingletonDemo();
                break;
            case 2:
                ProxyDemo proxyDemo = new ProxyDemo();
                proxyDemo.runProxyDemo();
                break;
            case 3:
                FactoryDemo factoryDemo = new FactoryDemo();
                factoryDemo.runFactoryDemo();
                break;
            case 4:
                HibernateDemo hibernateDemo = new HibernateDemo();
                hibernateDemo.runHibernateDemo();
                break;
            default:
                System.out.println("Invalid input.");
        }
        return false;
    }
}
