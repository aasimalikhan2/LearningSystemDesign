package strategyDesignPattern.goodCode.Strategy;

public class SportDrive implements DriveStrategy{
    @Override
    public void drive()
    {
        System.out.println("Driving the Vehicle in Sport mode");
    }
}
