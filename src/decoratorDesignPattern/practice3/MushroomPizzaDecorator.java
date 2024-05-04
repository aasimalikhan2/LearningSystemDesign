package decoratorDesignPattern.practice3;

public class MushroomPizzaDecorator extends PizzaDecorator{

    public MushroomPizzaDecorator(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost()
    {
        return this.pizza.cost() + 20;
    }

}
