package decoratorDesignPattern.practice4;

public class SmallSizeBank implements BaseBank{
    @Override
    public int price() {
        return 100000;
    }
}
