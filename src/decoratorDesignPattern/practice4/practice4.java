package decoratorDesignPattern.practice4;

public class practice4 {
    public static void main(String[] args) {
        BaseBank montecitoBank = new MontecitoBank();
        BaseBank montecitoWithCustomization = new InternationalPhoneBankDecorator(new LoadBalancingBankDecorator(new CustomUIThemeBankDecorator(montecitoBank)));
        System.out.println("montecitoBank price: " + montecitoBank.price());
        System.out.println("montecitoBankWithCustomization price: " + montecitoWithCustomization.price());

        BaseBank parkNationalBank = new ParkNationalBank();
        BaseBank parkNationalWithCustomization = new CustomUIThemeBankDecorator(parkNationalBank);
        System.out.println("parkNationalBank price: " + parkNationalBank.price());
        System.out.println("parkNationalBankWithCustomization price: " + parkNationalWithCustomization.price());
    }
}
