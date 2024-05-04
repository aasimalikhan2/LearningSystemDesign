package decoratorDesignPattern.practice6;

public class practice6 {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle();
        Shape rectangle1WithRedBorder = new RedBorderDecorator(rectangle1);
        rectangle1WithRedBorder.draw();
    }
}
