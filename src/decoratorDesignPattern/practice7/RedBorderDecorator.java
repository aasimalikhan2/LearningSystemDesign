package decoratorDesignPattern.practice7;

public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw()
    {
        this.decoratedShape.draw();
        //additional functionality
        System.out.println("red Border added to SHape");
    }
}
