package decoratorDesignPattern.practice4;

public abstract class BankDecorator implements BaseBank{
    public BaseBank bank;

    public BankDecorator(BaseBank bank)
    {
        this.bank = bank;
    }

    @Override
    public int price()
    {
        return this.bank.price();
    }
}
