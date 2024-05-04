package decoratorDesignPattern.Assignment;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public int extraPrice = 0;
    public void addExtraMilk(int quantity)
    {
        System.out.println("Adding Milk: " + quantity + " ml");
        extraPrice += (quantity)/3;
    }
    public void procedure()
    {
        this.decoratedCoffee.procedure();
        addExtraMilk(50);
    }

    public int cost()
    {
        return this.decoratedCoffee.cost() + extraPrice;
    }
}
