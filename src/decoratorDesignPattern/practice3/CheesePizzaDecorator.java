package decoratorDesignPattern.practice3;

public class CheesePizzaDecorator extends PizzaDecorator{
    public CheesePizzaDecorator(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost()
    {
        return this.pizza.cost() + 25;
    }
}
