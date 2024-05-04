package decoratorDesignPattern.Assignment;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public void addExtraSugar(int quantity)
    {
        System.out.println("Adding extra sugar: " + quantity + " gm");
    }
    public void procedure()
    {
        this.decoratedCoffee.procedure();
        addExtraSugar(10);
    }

    public int cost()
    {
        return this.decoratedCoffee.cost();
    }
}
