package abstractFactoryDesignPattern.practice1;

public interface FurnitureFactory {
    Chair getChair();
    Sofa getSofa();
    CoffeeTable getCoffeeTable();
}
