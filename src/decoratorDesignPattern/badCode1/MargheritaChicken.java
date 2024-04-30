package decoratorDesignPattern.badCode1;

public class MargheritaChicken {
    public BasePizza pizza;
    public MargheritaChicken(BasePizza pizza)
    {
        this.pizza = pizza;
    }
    public int cost()
    {
        return pizza.cost() + 20;
    }
}
