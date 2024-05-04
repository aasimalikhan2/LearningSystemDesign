package decoratorDesignPattern.practice4;

public class LoadBalancingBankDecorator extends BankDecorator{
    public LoadBalancingBankDecorator(BaseBank bank) {
        super(bank);
    }
    @Override
    public int price()
    {
        return this.bank.price() + 5000;
    }
}
