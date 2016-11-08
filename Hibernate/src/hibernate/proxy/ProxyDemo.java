
package hibernate.proxy;

/**
 *
 * @RJ
 */
public class ProxyDemo {
    public void runProxyDemo() {
        // Proxy Pattern
        System.out.println("Proxy Pattern Example:");
        Image image = new ProxyImage("sample-image.jpg");        
        // Loads image from disk.
        System.out.println("\nCalling image.display:");
        image.display();
        //Image has already been loaded so it will just read from memory.
        System.out.println("\nCalling image.display again:");
        image.display();
        System.out.println();
    }
}
