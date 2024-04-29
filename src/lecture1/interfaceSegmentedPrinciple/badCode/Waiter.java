package lecture1.interfaceSegmentedPrinciple.badCode;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {

    }

    @Override
    public void serveCustomer() {

    }

    @Override
    public void cookFood() {
        //waiter does not cook food, a Chef cooks food
    }
}
