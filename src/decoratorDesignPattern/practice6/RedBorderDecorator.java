package decoratorDesignPattern.practice6;

public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void setRedBorder(Shape decoratedShape)
    {
        System.out.println("Border Color: red");
    }
    @Override
    public void draw()
    {
        decoratedShape.draw();
        //more functionality
        setRedBorder(decoratedShape);
    }
}
