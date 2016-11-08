/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.factory;

/**
 *
 * @author Keith
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
