package strategyDesignPattern.goodCode.Strategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving the Vehicle in Normal mode");
    }
}
