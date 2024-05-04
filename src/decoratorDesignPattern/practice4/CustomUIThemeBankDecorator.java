package decoratorDesignPattern.practice4;

public class CustomUIThemeBankDecorator extends BankDecorator{
    public CustomUIThemeBankDecorator(BaseBank bank) {
        super(bank);
    }
    @Override
    public int price()
    {
        return this.bank.price() + 10000;
    }
}
