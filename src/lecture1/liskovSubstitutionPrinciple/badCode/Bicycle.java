package lecture1.liskovSubstitutionPrinciple.badCode;

public class Bicycle implements Bike{
    @Override
    public void turnOnEngine() {
        try {
            throw new Exception("Engine not available");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void accelerate() {

    }
}
