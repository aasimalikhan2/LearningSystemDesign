package decoratorDesignPattern.practice;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    Mushroom (BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
