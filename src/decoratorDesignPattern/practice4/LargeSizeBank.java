package decoratorDesignPattern.practice4;

public class LargeSizeBank implements BaseBank{
    @Override
    public int price() {
        return 500000;
    }
}
