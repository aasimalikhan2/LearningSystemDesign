package strategyDesignPattern2.badCode;

public class UpgradeTravelGroup extends TravelGroup{
    @Override
    public void travel()
    {
        System.out.println("Travelling by Private Van");
    }
}
