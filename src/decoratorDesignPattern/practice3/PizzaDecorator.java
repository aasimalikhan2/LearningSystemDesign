package decoratorDesignPattern.practice3;

public abstract class PizzaDecorator implements BasePizza{
    public BasePizza pizza;
    public PizzaDecorator(BasePizza pizza)
    {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost();
    }
}
