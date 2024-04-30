package decoratorDesignPattern.practice;

public class practice {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza margheritaWithToppings = new Mushroom(new ExtraCheese(margherita));
        System.out.println("Margherita with Toppings price: " + margheritaWithToppings.cost());
    }
}
