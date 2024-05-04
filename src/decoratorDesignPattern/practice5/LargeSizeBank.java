package decoratorDesignPattern.practice5;

public class LargeSizeBank implements BaseBank
{
    @Override
    public int cost() {
        return 500000;
    }
}
