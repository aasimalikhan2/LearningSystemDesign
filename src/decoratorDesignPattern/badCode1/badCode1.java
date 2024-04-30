package decoratorDesignPattern.badCode1;

public class badCode1 {
    public static void main(String[] args) {
        BasePizza margheritaPlain = new Margherita();
        System.out.println("Cost of Margherita plain: " + margheritaPlain.cost());

        MargheritaChicken margheritaChicken = new MargheritaChicken(margheritaPlain);
        System.out.println("Cost of Margherita chicken: " + margheritaChicken.cost());

        MargheritaExtraCheese margheritaExtraCheese = new MargheritaExtraCheese(margheritaPlain);
        System.out.println("Cost of Margherita extra cheese: " + margheritaExtraCheese.cost());
    }
}
