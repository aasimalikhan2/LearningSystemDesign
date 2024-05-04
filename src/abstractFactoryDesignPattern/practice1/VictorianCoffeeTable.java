package abstractFactoryDesignPattern.practice1;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void placeThingsOn() {
        System.out.println("Placing things on a Victorian Coffee Table");
    }
}
