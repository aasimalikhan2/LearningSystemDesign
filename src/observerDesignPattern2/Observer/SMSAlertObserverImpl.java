package observerDesignPattern2.Observer;

public class SMSAlertObserverImpl implements NotificationAlertObserver{
    public String phoneNumber;
    public SMSAlertObserverImpl(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void sendSMS(String phoneNumber, String message)
    {
        System.out.println("Sent message to " + phoneNumber + ", with content: " + message);
    }
    @Override
    public void update() {
        sendSMS(phoneNumber, "Product is in stock hurry up!");
    }
}
