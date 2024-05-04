package decoratorDesignPattern.Assignment;

public class Latte implements Coffee{
    @Override
    public void procedure() {
        System.out.println("Add Espresso Coffee 50ml");
        System.out.println("Add Steamed Milk 50ml");
        System.out.println("Add Foam 10ml");
    }

    @Override
    public int cost() {
        return 0;
    }
}
