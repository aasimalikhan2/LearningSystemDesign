package abstractFactoryDesignPattern.practice1;

public class practice1 {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Chair victorianChair = victorianFurnitureFactory.getChair();
        Sofa victorianSofa = victorianFurnitureFactory.getSofa();

        victorianChair.sitOn();
        victorianSofa.sitOn();
    }
}
