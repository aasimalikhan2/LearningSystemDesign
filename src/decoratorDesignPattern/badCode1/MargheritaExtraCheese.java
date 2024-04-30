package decoratorDesignPattern.badCode1;

public class MargheritaExtraCheese {
    public BasePizza pizza;

    public MargheritaExtraCheese(BasePizza pizza)
    {
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 10;
    }
}
