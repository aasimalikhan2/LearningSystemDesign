package decoratorDesignPattern.practice3;

public class practice3 {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza margheritaWithToppings = new CheesePizzaDecorator(new MushroomPizzaDecorator(margherita));
        System.out.println("Margherita with toppings price : " + margheritaWithToppings.cost());
    }
}
