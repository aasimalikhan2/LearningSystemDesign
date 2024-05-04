package decoratorDesignPattern.practice6;

public abstract class ShapeDecorator implements Shape {
    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw()
    {
        decoratedShape.draw();
    }
}
