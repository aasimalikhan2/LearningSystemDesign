package decoratorDesignPattern.Assignment;

public class CoffeeDecorator implements Coffee{
    Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public void procedure() {
        this.decoratedCoffee.procedure();
    }

    @Override
    public int cost() {
        System.out.println("Decorator bse class caledd");
        return this.decoratedCoffee.cost();
    }
}
