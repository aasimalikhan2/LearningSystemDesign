package decoratorDesignPattern.badCode1;

public class MargheritaMushroom {
    public BasePizza pizza;
    public MargheritaMushroom(BasePizza pizza)
    {
        this.pizza = pizza;
    }
    public int cost()
    {
        return pizza.cost() + 20;
    }
}
