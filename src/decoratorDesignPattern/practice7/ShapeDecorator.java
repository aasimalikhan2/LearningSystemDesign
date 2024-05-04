package decoratorDesignPattern.practice7;

public class ShapeDecorator implements Shape{
    Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
