package strategyDesignPattern.goodCode;

import strategyDesignPattern.goodCode.Strategy.DriveStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle(DriveStrategy obj) {
        super(obj);
    }
}
