package strategyDesignPattern.goodCode;

import strategyDesignPattern.goodCode.Strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy obj) {
        super(obj);
    }
}
