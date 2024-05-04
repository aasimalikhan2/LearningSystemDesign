package decoratorDesignPattern.practice4;

public class InternationalPhoneBankDecorator extends BankDecorator{
    public InternationalPhoneBankDecorator(BaseBank bank) {
        super(bank);
    }

    public int price()
    {
        return this.bank.price() + 15000;
    }
}
