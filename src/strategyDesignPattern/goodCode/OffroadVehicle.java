package strategyDesignPattern.goodCode;

import strategyDesignPattern.goodCode.Strategy.DriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle(DriveStrategy obj) {
        super(obj);
    }
}
