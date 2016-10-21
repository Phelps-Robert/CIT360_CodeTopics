
package hibernate.singleton;

public class SingletonDemo {
    public void runSingletonDemo() {
        // Singleton Pattern
        System.out.println("Singleton Pattern Example:");
        Singleton singletonExample = Singleton.getInstance();
        singletonExample.demoMethod();
        System.out.println();
    }
}
