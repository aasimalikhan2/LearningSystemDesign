package strategyDesignPattern2.badCode;

public class PremiumTravelGroup extends TravelGroup{
    @Override
    public void travel()
    {
        System.out.println("Travelling by Private Van");
    }
}
