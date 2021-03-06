
package hibernate.singleton;

/**
 *
 * @author RJ
 */
public class Singleton {
    private static Singleton instance = null;
    
    private Singleton() { }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void demoMethod() {
        System.out.println("Demo Singleton");
    }
}
