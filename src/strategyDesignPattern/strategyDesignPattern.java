package strategyDesignPattern;

import strategyDesignPattern.goodCode.OffroadVehicle;
import strategyDesignPattern.goodCode.PassengerVehicle;
import strategyDesignPattern.goodCode.SportVehicle;
import strategyDesignPattern.goodCode.Strategy.DriveStrategy;
import strategyDesignPattern.goodCode.Strategy.FuelSaveDrive;
import strategyDesignPattern.goodCode.Strategy.NormalDrive;
import strategyDesignPattern.goodCode.Strategy.SportDrive;
import strategyDesignPattern.goodCode.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class strategyDesignPattern {
    public static void Main()
    {
        List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
        DriveStrategy normalDriveStrategy = new NormalDrive();
        DriveStrategy fuelSaveDriveStrategy = new FuelSaveDrive();
        DriveStrategy sportDriveStrategy = new SportDrive();
        listOfVehicles.add(new OffroadVehicle(sportDriveStrategy));
        listOfVehicles.add(new SportVehicle(sportDriveStrategy));
        listOfVehicles.add(new PassengerVehicle(normalDriveStrategy));
        for(int i = 0; i < listOfVehicles.size(); i++)
        {
            listOfVehicles.get(i).drive();
        }
    }
}
