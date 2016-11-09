
package hibernate.factory;

/**
 *
 * @author RJ
 */
public class FactoryDemo {
    public void runFactoryDemo() {
        System.out.println("Factory Pattern Example:");
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        System.out.println();
    }
}
