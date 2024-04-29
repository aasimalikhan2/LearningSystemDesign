package strategyDesignPattern.goodCode.Strategy;

public class FuelSaveDrive implements DriveStrategy{
    @Override
    public void drive()
    {
        System.out.println("Driving the Vehicle in Fuel Save mode");
    }
}
