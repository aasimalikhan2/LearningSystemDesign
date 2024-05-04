package decoratorDesignPattern.practice5;

public abstract class BankDecorator implements BaseBank {
    BaseBank bank;
    public BankDecorator(BaseBank bank)
    {
        this.bank = bank;
    }
    @Override
    public int cost() {
        return this.bank.cost();
    }
}
