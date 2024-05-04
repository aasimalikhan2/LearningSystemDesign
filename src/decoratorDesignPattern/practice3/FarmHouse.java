package decoratorDesignPattern.practice3;

public class FarmHouse implements BasePizza{

    @Override
    public int cost() {
        return 100;
    }
}
