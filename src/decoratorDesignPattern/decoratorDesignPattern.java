package decoratorDesignPattern;

public class decoratorDesignPattern {
    public static void main(String[] args) {
        BasePizza pizzaWithToppings = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Price of the pizza with Extra Cheese and Mushrooms: " + pizzaWithToppings.cost());
    }
}
