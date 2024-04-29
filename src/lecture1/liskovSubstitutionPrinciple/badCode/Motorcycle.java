package lecture1.liskovSubstitutionPrinciple.badCode;

public class Motorcycle implements Bike{
    boolean isEngineOn = false;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
