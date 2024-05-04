package decoratorDesignPattern.practice4;

public class MedSizeBank implements BaseBank{
    @Override
    public int price() {
        return 200000;
    }
}
