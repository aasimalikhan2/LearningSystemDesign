package strategyDesignPattern.goodCode;

import strategyDesignPattern.goodCode.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy obj)
    {
        this.driveStrategy = obj;
    }

    public void drive()
    {
        this.driveStrategy.drive();
    }
}
