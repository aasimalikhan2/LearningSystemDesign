package decoratorDesignPattern.practice5;

public class PremierCoreBankDecorator extends BankDecorator{

    public PremierCoreBankDecorator(BaseBank bank) {
        super(bank);
    }

    @Override
    public int cost()
    {
        return this.bank.cost();
    }
}
