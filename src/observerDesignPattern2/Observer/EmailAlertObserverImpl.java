package observerDesignPattern2.Observer;

import oberverDesignPattern.Observer.EmailAlertObserverimpl;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    public String email;
    public EmailAlertObserverImpl(String email)
    {
        this.email = email;
    }
    public void sendEmail(String email, String message)
    {
        System.out.println("Sent email to " + email + ", with content: " + message);
    }
    @Override
    public void update() {
        sendEmail(email, "Product is in stock hurry up!");
    }
}
