package decoratorDesignPattern.Assignment;

public class Espresso implements Coffee{
    @Override
    public void procedure() {
        System.out.println("Add Espresso Coffee 15g");
        System.out.println("Add Hot Water 100ml");
    }

    @Override
    public int cost() {
        return 100;
    }
}
