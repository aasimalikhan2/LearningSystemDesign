package factoryDesignPattern.practice1;

//The Factory Pattern is useful when you have a scenario where the client
// code needs to create objects of different types, but the specific type
// of object to be created may vary based on runtime conditions, configuration
// settings, or other factors. It promotes loose coupling between the client
// code and the created objects, as the client does not need to know the
// specific class of object being created, only the interface or base class they implement/extend.
public class practice1 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
