package decoratorDesignPattern.Assignment;

public class Assignment {
    public static void main(String[] args) {
        Coffee latte1 = new Latte();
        Coffee latte1WithMilk = new MilkDecorator(latte1);
        Coffee latte1WithSugarWithMilk = new SugarDecorator(latte1WithMilk);

        latte1WithSugarWithMilk.procedure();
        System.out.println(" Latte1WithSugarWithMilkk price" + latte1WithSugarWithMilk.cost());
    }
}
