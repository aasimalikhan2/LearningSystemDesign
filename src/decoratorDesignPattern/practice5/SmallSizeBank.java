package decoratorDesignPattern.practice5;

public class SmallSizeBank implements BaseBank {
    @Override
    public int cost() {
        return 100000;
    }
}
