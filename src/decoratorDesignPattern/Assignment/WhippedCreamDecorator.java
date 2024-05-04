package decoratorDesignPattern.Assignment;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public int extraPrice = 0;
    public void addExtraWhippedCream(int quantity)
    {
        System.out.println("Adding extra Whipped Cream: " + quantity + " ml");
        extraPrice += quantity/2;
    }
    public void procedure()
    {
        this.decoratedCoffee.procedure();
        addExtraWhippedCream(10);
    }

    public int cost()
    {
        return this.decoratedCoffee.cost() + extraPrice;
    }
}
