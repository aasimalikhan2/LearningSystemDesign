package abstractFactoryDesignPattern.practice1;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void placeThingsOn() {
        System.out.println("Placing things on Modern Coffee Table");
    }
}
