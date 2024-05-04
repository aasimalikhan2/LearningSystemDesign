package decoratorDesignPattern.practice5;

public class MedSizeBank implements BaseBank{
    @Override
    public int cost() {
        return 200000;
    }
}
