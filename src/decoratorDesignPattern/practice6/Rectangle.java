package decoratorDesignPattern.practice6;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a shape rectangle");
    }
}
